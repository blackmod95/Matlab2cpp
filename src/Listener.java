import java.util.ArrayList;
import java.util.HashMap;
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

    @Override public void enterMatrix(Matlab2cppParser.MatrixContext ctx) {
        if (ctx.LSQB() != null && ctx.RSQB() != null)
        {
            matrixToInit = new Matrix<Double>();
        }
    }

    @Override public void enterNumber(Matlab2cppParser.NumberContext ctx) {
        if (ctx.parent instanceof Matlab2cppParser.LineContext) {
            matrixToInit.data.add(Double.parseDouble(ctx.DIGIT().getText()));
        }
    }

    @Override public void exitLine(Matlab2cppParser.LineContext ctx) {
        if (matrixToInit.size.size() < 1)
        {
            matrixToInit.size.add(ctx.getChildCount());
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
        matrixValues.put(name, matrixToInit);

        String opName = new String("Init_matrix");
        ArrayList<String> args = new ArrayList<>();
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
