import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Listener extends Matlab2cppBaseListener {
    public Stack<Operation> stack;
    public HashMap<String, Variable> varValues;
    public HashMap<String, Matrix> matrixValues;
    private Variable varToInit;
    private Matrix matrixToInit;

    Listener() {
        stack = new Stack<Operation>();
        varValues = new HashMap<String, Variable>();
        matrixValues = new HashMap<String, Matrix>();
    }

    @Override public void exitLine(Matlab2cppParser.LineContext ctx) {
        if (matrixToInit.size.size() < 1) {
            matrixToInit.size.add(ctx.getChildCount());
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

    @Override public void exitMatrix(Matlab2cppParser.MatrixContext ctx) {
        if (matrixToInit.size.size() < 2)
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
                matrixToInit.size.add(sizeCounter);
            }
        }
    }

    @Override public void exitInit_matrix(Matlab2cppParser.Init_matrixContext ctx) {
        String name = ctx.NAME().getText();
        String opName = new String();
        ArrayList<String> args = new ArrayList<String>();

        // Инициализация матрицы вручную, перечисляя все значения
        if (ctx.getChild(2) instanceof Matlab2cppParser.MatrixContext) {
            matrixValues.put(name, matrixToInit);

            opName = new String("Init_matrix");
        }
        // Инициализация вектора с помощью диапазонов
        if (ctx.getChild(2) instanceof Matlab2cppParser.RangeContext)
        {
            ParseTree range = ctx.getChild(2);
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
        }
        // Матрица, состаящая из нулей. Любых размеров и размерностей.
        if (ctx.getChild(2) instanceof Matlab2cppParser.ZerosContext)
        {
            ParseTree zeros = ctx.getChild(2);
            opName = new String ("Init_zeros");
            for (int j = 0; j < zeros.getChildCount(); j++)
            {
                if (zeros.getChild(j) instanceof Matlab2cppParser.NumberContext)
                {
                    args.add(zeros.getChild(j).getText());
                }
            }
        }
        // Матрица, состаящая из нулей. Любых размеров и размерностей.
        if (ctx.getChild(2) instanceof Matlab2cppParser.OnesContext)
        {
            ParseTree ones = ctx.getChild(2);
            opName = new String ("Init_ones");
            for (int j = 0; j < ones.getChildCount(); j++)
            {
                if (ones.getChild(j) instanceof Matlab2cppParser.NumberContext)
                {
                    args.add(((Matlab2cppParser.NumberContext) ones.getChild(j)).DIGIT().getText());
                }
            }
        }
        // Квадратная единичная матрица, размерности 2.
        if (ctx.getChild(2) instanceof Matlab2cppParser.EyeContext)
        {
            ParseTree eye = ctx.getChild(2);
            opName = new String ("Init_eye");

            args.add(eye.getChild(1).getText());
        }

        Operation init = new Operation(opName, args, name);
        stack.push(init);
    }

    @Override public void enterInit_var(Matlab2cppParser.Init_varContext ctx) {
        String name = ctx.NAME().getText();
        String value = ctx.number().DIGIT().getText();

        varToInit = new Variable<Double>(Double.parseDouble(value));

        varValues.put(name, varToInit);

        String opName = new String("Init_var");
        ArrayList<String> args = new ArrayList<>();
        Operation init = new Operation(opName, args, name);
        stack.push(init);
    }

}
