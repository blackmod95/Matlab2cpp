import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Listener extends Matlab2cppBaseListener {
    public Stack<Operation> stack;
    public Stack<String> eqStack;
    public HashMap<String, Variable> varValues;
    public HashMap<String, Matrix> matrixValues;
    private Variable varToInit;
    private Matrix matrixToInit;
    private int tmpCounter = 0;

    Listener() {
        stack = new Stack<Operation>();
        eqStack = new Stack<String>();
        varValues = new HashMap<String, Variable>();
        matrixValues = new HashMap<String, Matrix>();
    }

    @Override public void exitLine(Matlab2cppParser.LineContext ctx) {
        if (matrixToInit.columnSize == 0) {
            matrixToInit.columnSize = ctx.getChildCount();
        }
        List<ParseTree> numbers = ctx.children;
        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) instanceof Matlab2cppParser.NumberContext)
            {
                matrixToInit.data.add(Double.parseDouble(((Matlab2cppParser.NumberContext) numbers.get(i)).DIGIT().getText()));
            }
        }
    }

    @Override public void enterMatrix(Matlab2cppParser.MatrixContext ctx) {
        if (ctx.LSQB() != null && ctx.RSQB() != null)
        {
            matrixToInit = new Matrix<Double>();
        }
    }

    @Override public void exitMatrix(Matlab2cppParser.MatrixContext ctx)
    {
        Integer amount = ctx.getChildCount();
        Integer sizeCounter = 0;

        for (int i = 0; i < amount; i++)
        {
            if (ctx.getChild(i) instanceof Matlab2cppParser.LineContext)
            {
                sizeCounter++;
            }
        }

        if (sizeCounter > 0) {
            matrixToInit.rowSize = sizeCounter;
        }
    }

    @Override public void exitInit_matrix(Matlab2cppParser.Init_matrixContext ctx) {
        String name = ctx.lvalue().NAME().getText();
        String opName = new String();
        ArrayList<String> args = new ArrayList<String>();

        // Инициализация матрицы вручную, перечисляя все значения
        if (ctx.getChild(2).getChild(0) instanceof Matlab2cppParser.MatrixContext) {
            matrixValues.put(name, matrixToInit);

            opName = new String("Init_matrix");
        }
        // Инициализация вектора с помощью диапазонов
        if (ctx.getChild(2).getChild(0) instanceof Matlab2cppParser.RangeContext)
        {
            ParseTree range = ctx.getChild(2).getChild(0);
            opName = new String ("Init_range");
            if (range.getChildCount() == 3)
            {
                args.add(range.getChild(0).getText());
                args.add(range.getChild(2).getText());
            }
            else if (range.getChildCount() == 5)
            {
                args.add(range.getChild(0).getText());
                args.add(range.getChild(2).getText());
                args.add(range.getChild(4).getText());
            }

            double start = 0, end = 0, step = 1;
            if (args.size() == 2)
            {
                start = Integer.parseInt(args.get(0));
                end = Integer.parseInt(args.get(1));
            }
            else
            {
                start = Integer.parseInt(args.get(0));
                step = Integer.parseInt(args.get(1));
                end = Integer.parseInt(args.get(2));
            }

            int size = (int)Math.floor((end - start) / step);
            Matrix m = new Matrix(new ArrayList<Double>(), 1, size);

            matrixValues.put(name, m);
        }
        // Матрица, состаящая из нулей. Любых размеров и размерностей.
        if (ctx.getChild(2).getChild(0) instanceof Matlab2cppParser.ZerosContext)
        {
            ParseTree zeros = ctx.getChild(2).getChild(0);
            opName = new String ("Init_zeros");
            for (int j = 0; j < zeros.getChildCount(); j++)
            {
                if (zeros.getChild(j) instanceof Matlab2cppParser.NumberContext)
                {
                    args.add(zeros.getChild(j).getText());
                }
            }

            Matrix m = new Matrix(new ArrayList<Double>(), Integer.parseInt(args.get(0)), Integer.parseInt(args.get(1)));

            matrixValues.put(name, m);
        }
        // Матрица, состаящая из единиц. Любых размеров и размерностей.
        if (ctx.getChild(2).getChild(0) instanceof Matlab2cppParser.OnesContext)
        {
            ParseTree ones = ctx.getChild(2).getChild(0);
            opName = new String ("Init_ones");
            for (int j = 0; j < ones.getChildCount(); j++)
            {
                if (ones.getChild(j) instanceof Matlab2cppParser.NumberContext)
                {
                    args.add(((Matlab2cppParser.NumberContext) ones.getChild(j)).DIGIT().getText());
                }
            }

            Matrix m = new Matrix(new ArrayList<Double>(), Integer.parseInt(args.get(0)), Integer.parseInt(args.get(1)));

            matrixValues.put(name, m);
        }
        // Квадратная единичная матрица, размерности 2.
        if (ctx.getChild(2).getChild(0) instanceof Matlab2cppParser.EyeContext)
        {
            ParseTree eye = ctx.getChild(2).getChild(0);
            opName = new String ("Init_eye");

            args.add(eye.getChild(1).getText());

            Matrix m = new Matrix(new ArrayList<Double>(), Integer.parseInt(args.get(0)), Integer.parseInt(args.get(0)));

            matrixValues.put(name, m);
        }

        Operation init = new Operation(opName, args, name);
        stack.push(init);
    }

    @Override public void enterInit_var(Matlab2cppParser.Init_varContext ctx) {
        String name = ctx.lvalue().NAME().getText();
        String value = ctx.number().DIGIT().getText();

        varToInit = new Variable<Double>(Double.parseDouble(value));

        varValues.put(name, varToInit);

        String opName = new String("Init_var");
        ArrayList<String> args = new ArrayList<>();
        Operation init = new Operation(opName, args, name);
        stack.push(init);
    }

    @Override public void exitEquation(Matlab2cppParser.EquationContext ctx)
    {
        String outName = ctx.lvalue().NAME().getText();

        Operation op = stack.pop();

        String result = op.answerName;
        if (!matrixValues.containsKey(outName) && !varValues.containsKey(outName))
        {
            if (matrixValues.containsKey(result)) {
                Matrix m = matrixValues.remove(result);
                m.toInit = true;
                matrixValues.put(outName, m);
            } else if (varValues.containsKey(result)) {
                Variable v = varValues.remove(result);
                v.toInit = true;
                varValues.put(outName, v);
            }
        }

        op.answerName = outName;

        stack.push(op);

        eqStack.clear();
    }

    @Override public void exitRvalue(Matlab2cppParser.RvalueContext ctx)
    {
        if (ctx.lb_ops() != null)
        {
            // бинарная операция с низким приоритетом
            String name = new String("tmp" + tmpCounter);
            tmpCounter++;

            ArrayList<String> args = new ArrayList<>();
            String arg2 = eqStack.pop();
            String arg1 = eqStack.pop();
            args.add(arg1);
            args.add(arg2);

            String p1 = "", p2 = "", p3 = "";
            if (matrixValues.containsKey(arg1))
            {
                p1 = new String("Matrix");
            }
            else if (varValues.containsKey(arg1))
            {
                p1 = new String("Var");
            }

            if (matrixValues.containsKey(arg2))
            {
                p3 = new String("matrix");
            }
            else if (varValues.containsKey(arg2))
            {
                p3 = new String("var");
            }

            if (ctx.lb_ops().PLUS() != null)
            {
                p2 = new String("plus");
            }
            else if (ctx.lb_ops().MINUS() != null)
            {
                p2 = new String("minus");
            }

            String opName = p1 + "_" + p2 + "_" + p3;

            Operation op = new Operation(opName, args, name);
            stack.push(op);

            eqStack.push(name);

            if (p1.equals("Var") && p3.equals("var"))
            {
                varValues.put(name, new Variable(0.0));
            }
            else
            {
                int rowSize = 0, columnSize = 0;
                if (p1.equals("Matrix"))
                {
                    Matrix m = matrixValues.get(arg1);
                    rowSize = Math.max(rowSize, m.rowSize);
                    columnSize = Math.max(columnSize, m.columnSize);
                }
                if (p1.equals("matrix"))
                {
                    Matrix m = matrixValues.get(arg2);
                    rowSize = Math.max(rowSize, m.rowSize);
                    columnSize = Math.max(columnSize, m.columnSize);
                }

                matrixValues.put(name, new Matrix(new ArrayList(), rowSize, columnSize));
            }
        }
    }

    @Override public void exitTerm(Matlab2cppParser.TermContext ctx)
    {
        if (ctx.number() != null)
        {
            // число можно инициализировать как временную переменную
            String name = new String("tmp" + tmpCounter);
            tmpCounter++;

            String value = ctx.number().DIGIT().getText();
            varToInit = new Variable<Double>(Double.parseDouble(value));

            varValues.put(name, varToInit);

            String opName = new String("Init_var");
            ArrayList<String> args = new ArrayList<>();
            Operation init = new Operation(opName, args, name);
            stack.push(init);

            eqStack.push(name);
        }
        if (ctx.hb_ops() != null)
        {
            // бинарная операция с наивысшим приоритетом
            String name = new String("tmp" + tmpCounter);
            tmpCounter++;

            ArrayList<String> args = new ArrayList<>();
            String arg2 = eqStack.pop();
            String arg1 = eqStack.pop();
            args.add(arg1);
            args.add(arg2);

            String p1 = "", p2 = "", p3 = "";
            if (matrixValues.containsKey(arg1))
            {
                p1 = new String("Matrix");
            }
            else if (varValues.containsKey(arg1))
            {
                p1 = new String("Var");
            }

            if (matrixValues.containsKey(arg2))
            {
                p3 = new String("matrix");
            }
            else if (varValues.containsKey(arg2))
            {
                p3 = new String("var");
            }

            if (ctx.hb_ops().PMUL() != null)
            {
                p2 = new String("mul");
            }
            else if (ctx.hb_ops().PDIV() != null)
            {
                p2 = new String("div");
            }

            String opName = p1 + "_" + p2 + "_" + p3;

            Operation op = new Operation(opName, args, name);
            stack.push(op);

            eqStack.push(name);

            if (p1.equals("Var") && p3.equals("var"))
            {
                varValues.put(name, new Variable(0.0));
            }
            else
            {
                int rowSize = 0, columnSize = 0;
                if (p1.equals("Matrix"))
                {
                    Matrix m = matrixValues.get(arg1);
                    rowSize = Math.max(rowSize, m.rowSize);
                    columnSize = Math.max(columnSize, m.columnSize);
                }
                if (p1.equals("matrix"))
                {
                    Matrix m = matrixValues.get(arg2);
                    rowSize = Math.max(rowSize, m.rowSize);
                    columnSize = Math.max(columnSize, m.columnSize);
                }

                matrixValues.put(name, new Matrix(new ArrayList(), rowSize, columnSize));
            }
        }
    }

    @Override public void exitU_ops(Matlab2cppParser.U_opsContext ctx)
    {
        String opName = "";
        ArrayList<String> args = new ArrayList<>();

        if (ctx.NAME() != null)
        {
            String name = ctx.NAME().getText();
            if (matrixValues.containsKey(name) || varValues.containsKey(name))
            {
                eqStack.push(name);
            }
            else
            {
                System.err.println("Argument " + name + " not found.");
            }
        }

        if (ctx.getChildCount() > 1)
        {
            // Операции есть. Придется создать новую матрицу с результатом выражения
            if (ctx.MINUS() != null)
            {
                // есть унарный минус, добавляем соответствующую операцию к имени новой матрицы
                if (matrixValues.containsKey(ctx.NAME().getText()))
                {
                    // Это матрица
                    String operName = "Uminus_matrix";

                    ArrayList<String> argumentNames = new ArrayList<>();
                    argumentNames.add(eqStack.peek());

                    // Название матрицы для промежуточного результата
                    String answerName = "tmp" + tmpCounter;
                    tmpCounter++;

                    // из исходной матрицы берем размеры
                    Matrix mArg = matrixValues.get(eqStack.pop());

                    // Кладем в мап матрицу с промежуточным результатом. Считать ничего не надо, важны только размеры
                    matrixValues.put(answerName, new Matrix(new ArrayList(), mArg.rowSize, mArg.columnSize));

                    // Кладем в стек название промежуточного результата
                    eqStack.push(answerName);

                    stack.push(new Operation(operName, argumentNames, answerName));
                }
                if (varValues.containsKey(ctx.NAME().getText()))
                {
                    // Это переменная
                    String operName = "Uminus_var";

                    ArrayList<String> argumentNames = new ArrayList<>();
                    argumentNames.add(eqStack.peek());

                    // Название переменной для промежуточного результата
                    String answerName = "tmp" + tmpCounter;
                    tmpCounter++;

                    // Кладем в мап переменную с промежуточным результатом. Значение не имеет значения
                    varValues.put(answerName, new Variable(0));

                    // Кладем в стек название промежуточного результата
                    eqStack.push(answerName);

                    stack.push(new Operation(operName, argumentNames, answerName));
                }
            }
            if (ctx.TRANSPOSE() != null)
            {
                // есть транспонирование, интересно в нашем случае только для матриц
                if (matrixValues.containsKey(ctx.NAME().getText()))
                {
                    // Это матрица
                    String operName = "Transpose_matrix";

                    ArrayList<String> argumentNames = new ArrayList<>();
                    argumentNames.add(eqStack.peek());

                    // Название матрицы для промежуточного результата
                    String answerName = "tmp" + tmpCounter;
                    tmpCounter++;

                    // из исходной матрицы берем размеры
                    Matrix mArg = matrixValues.get(eqStack.pop());

                    // Кладем в мап матрицу с промежуточным результатом. Считать ничего не надо, важны только размеры транспонированной матрицы
                    matrixValues.put(answerName, new Matrix(new ArrayList(), mArg.columnSize, mArg.rowSize));

                    // Кладем в стек название промежуточного результата
                    eqStack.push(answerName);

                    stack.push(new Operation(operName, argumentNames, answerName));
                }
                if (varValues.containsKey(ctx.NAME().getText()))
                {
                    // Кладем на стек название переменной
                    eqStack.push(ctx.NAME().getText());
                }
            }
        }
    }



}
