import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
            if (op.operation.equals("Init_range"))
            {
                fileWriter.write("\tMatrix " + op.answerName + ";\n");

                double start = 0, end = 0, step = 1;
                if (op.argumentNames.size() == 2)
                {
                    start = Double.parseDouble(op.argumentNames.get(0));
                    end = Double.parseDouble(op.argumentNames.get(1));
                }
                else if (op.argumentNames.size() == 3)
                {
                    start = Double.parseDouble(op.argumentNames.get(0));
                    step = Double.parseDouble(op.argumentNames.get(1));
                    end = Double.parseDouble(op.argumentNames.get(2));
                }

                int size = (int) Math.floor((end - start) / step);
                double value = start;

                fileWriter.write("\t" + op.answerName + ".size.push_back(" + size + ");\n");
                fileWriter.write("\t" + op.answerName + ".size.push_back(1);\n");

                fileWriter.write("\tdouble " + op.answerName + "_start = " + start + ";\n");
                fileWriter.write("\tdouble " + op.answerName + "_step = " + step + ";\n");
                fileWriter.write("\tdouble " + op.answerName + "_end = " + end + ";\n");
                fileWriter.write("\tint " + op.answerName + "_size = (int) ((" + op.answerName + "_end - " + op.answerName + "_start) / " + op.answerName + "_step);\n");
                fileWriter.write("\tfor (int j = 0; j < " + op.answerName + "_size ;j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(start + j * step)\n");
                fileWriter.write("\t}\n");
            }
            if (op.operation.equals("Init_zeros"))
            {
                fileWriter.write("\tMatrix " + op.answerName + ";\n");
                ArrayList<Integer> sizes = new ArrayList<>();
                for (int j = 0; j < op.argumentNames.size(); j++)
                {
                    sizes.add(Integer.parseInt(op.argumentNames.get(j)));
                }

                int totalSize = 1;
                for (int j = 0; j < sizes.size(); j++)
                {
                    totalSize = totalSize * sizes.get(j);
                    fileWriter.write("\t" + op.answerName + ".size.push_back(" + sizes.get(j) + ");\n");
                }

                fileWriter.write("\tfor (int j = 0; j < " + totalSize + " ;j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(0)\n");
                fileWriter.write("\t}\n");
            }
            if (op.operation.equals("Init_ones"))
            {
                fileWriter.write("\tMatrix " + op.answerName + ";\n");
                ArrayList<Integer> sizes = new ArrayList<>();
                for (int j = 0; j < op.argumentNames.size(); j++)
                {
                    sizes.add(Integer.parseInt(op.argumentNames.get(j)));
                }

                int totalSize = 1;
                for (int j = 0; j < sizes.size(); j++)
                {
                    totalSize = totalSize * sizes.get(j);
                    fileWriter.write("\t" + op.answerName + ".size.push_back(" + sizes.get(j) + ");\n");
                }

                fileWriter.write("\tfor (int j = 0; j < " + totalSize + " ;j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(1)\n");
                fileWriter.write("\t}\n");
            }
            if (op.operation.equals("Init_eye"))
            {
                fileWriter.write("\tMatrix " + op.answerName + ";\n");
                int size = Integer.parseInt(op.argumentNames.get(0));

                fileWriter.write("\t" + op.answerName + ".size.push_back(" + size + ");\n");
                fileWriter.write("\t" + op.answerName + ".size.push_back(" + size + ");\n");

                fileWriter.write("\tfor (int j1 = 0; j1 < " + size + " ;j1++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\tfor (int j2 = 0; j2 < " + size + " ;j2++)\n");
                fileWriter.write("\t\t{\n");
                fileWriter.write("\t\t\tif(j1 == j2)\n");
                fileWriter.write("\t\t\t{\n");

                fileWriter.write("\t\t\t\t" + op.answerName + ".data.push_back(1)\n");
                fileWriter.write("\t\t\t}\n\t\t\telse\n\t\t\t{");
                fileWriter.write("\t\t\t\t" + op.answerName + ".data.push_back(0)\n");

                fileWriter.write("\t\t\t}\n");
                fileWriter.write("\t\t}\n");
                fileWriter.write("\t}\n");
            }
        }

        fileWriter.write("\treturn 0;\n}");
        fileWriter.flush();
    }
}
