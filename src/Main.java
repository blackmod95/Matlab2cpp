import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileReader("input.txt"));
        Matlab2cppLexer lexer = new Matlab2cppLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Matlab2cppParser parser = new Matlab2cppParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener();
        walker.walk((ParseTreeListener) listener, tree);

        FileWriter fileWriter = new FileWriter("output.cpp");
        fileWriter.write("#include <iostream>\n");
        fileWriter.write("#include <vector>\n");
        fileWriter.write("#include <string>\n");
        fileWriter.write("\n\n");
        fileWriter.write("struct Matrix\n");
        fileWriter.write("{\n");
        fileWriter.write("\tstd::vector<double> data;\n");
        fileWriter.write("\tstd::vector<int> size;\n");
        fileWriter.write("}\n\n");

        fileWriter.write("int main()\n{\n");

        for (int i = 0; i < listener.stack.size(); i++)
        {
            Operation op = listener.stack.get(i);
            if (op.operation.equals("Init_var"))
            {
                fileWriter.write("\tdouble " + op.answerName + " = " + listener.varValues.get(op.answerName).value + ";\n");
            }
            if (op.operation.equals("Init_matrix"))
            {
                fileWriter.write("\tMatrix " + op.answerName + ";\n");
                Matrix<Double> matrix = listener.matrixValues.get(op.answerName);

                for (int j = 0; j < matrix.size.size(); j++)
                {
                    fileWriter.write("\t" + op.answerName + ".size.push_back(" + matrix.size.get(j) + ");\n");
                }
                for (int j = 0; j < matrix.data.size(); j++)
                {
                    fileWriter.write("\t" + op.answerName + ".data.push_back(" + matrix.data.get(j) + ");\n");
                }
            }
        }

        fileWriter.write("\treturn 0;\n}");
        fileWriter.flush();
    }
}
