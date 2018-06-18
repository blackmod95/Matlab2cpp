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
        fileWriter.write("\n");
        fileWriter.write("struct Matrix\n");
        fileWriter.write("{\n");
        fileWriter.write("\tstd::vector<double> data;\n");
        fileWriter.write("\tint rowSize;\n");
        fileWriter.write("\tint columnSize;\n");
        fileWriter.write("};\n\n");

        fileWriter.write("int main()\n{\n");

        int tmpNamesCounter = 1;

        for (int i = 0; i < listener.stack.size(); i++)
        {
            Operation op = listener.stack.get(i);
            if (op.operation.equals("Init_var"))
            {
                fileWriter.write("\t// Initialization of variable " + op.answerName + "\n");
                fileWriter.write("\tdouble " + op.answerName + " = " + listener.varValues.get(op.answerName).value + ";\n\n");
                listener.varValues.get(op.answerName).toInit = false;
            }
            if (op.operation.equals("Init_matrix"))
            {
                fileWriter.write("\t// Initialization of matrix " + op.answerName + " by list of values\n");

                fileWriter.write("\tMatrix " + op.answerName + ";\n");
                Matrix<Double> matrix = listener.matrixValues.get(op.answerName);

                fileWriter.write("\t" + op.answerName + ".rowSize = " + matrix.rowSize + ";\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + matrix.columnSize + ";\n");

                for (int j = 0; j < matrix.data.size(); j++)
                {
                    fileWriter.write("\t" + op.answerName + ".data.push_back(" + matrix.data.get(j) + ");\n");
                }
                fileWriter.write("\n");
            }
            if (op.operation.equals("Init_range"))
            {
                fileWriter.write("\t// Initialization of vector " + op.answerName + " by range\n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);
                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }

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

                if (!exists)
                {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = 1;
                    matrix.columnSize = size;

                    listener.matrixValues.put(op.answerName, matrix);
                }
                else
                {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = 1;
                    listener.matrixValues.get(op.answerName).columnSize = size;
                }

                fileWriter.write("\t" + op.answerName + ".size.push_back(" + size + ");\n");
                fileWriter.write("\t" + op.answerName + ".size.push_back(1);\n");

                fileWriter.write("\tdouble " + op.answerName + "_start = " + start + ";\n");
                fileWriter.write("\tdouble " + op.answerName + "_step = " + step + ";\n");
                fileWriter.write("\tdouble " + op.answerName + "_end = " + end + ";\n");
                fileWriter.write("\tint " + op.answerName + "_size = (int) ((" + op.answerName + "_end - " + op.answerName + "_start) / " + op.answerName + "_step);\n");
                fileWriter.write("\tfor (int j = 0; j < " + op.answerName + "_size ;j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(start + j * step)\n");
                fileWriter.write("\t}\n\n");
            }
            if (op.operation.equals("Init_zeros"))
            {
                fileWriter.write("\t// Initialization of matrix " + op.answerName + " by zeros\n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);
                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }

                Integer rowSize = Integer.parseInt(op.argumentNames.get(0));
                Integer columnSize = Integer.parseInt(op.argumentNames.get(1));

                if (!exists)
                {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = rowSize;
                    matrix.columnSize = columnSize;

                    listener.matrixValues.put(op.answerName, matrix);
                }
                else
                {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = rowSize;
                    listener.matrixValues.get(op.answerName).columnSize = columnSize;
                }

                int totalSize = rowSize * columnSize;

                fileWriter.write("\t" + op.answerName + ".rowSize = " + rowSize + ");\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + columnSize + ");\n");

                fileWriter.write("\tfor (int j = 0; j < " + totalSize + "; j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(0)\n");
                fileWriter.write("\t}\n\n");
            }
            if (op.operation.equals("Init_ones"))
            {
                fileWriter.write("\t// Initialization of matrix " + op.answerName + " by ones\n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);
                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }

                Integer rowSize = Integer.parseInt(op.argumentNames.get(0));
                Integer columnSize = Integer.parseInt(op.argumentNames.get(1));

                if (!exists)
                {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = rowSize;
                    matrix.columnSize = columnSize;

                    listener.matrixValues.put(op.answerName, matrix);
                }
                else
                {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = rowSize;
                    listener.matrixValues.get(op.answerName).columnSize = columnSize;
                }

                int totalSize = rowSize * columnSize;

                fileWriter.write("\t" + op.answerName + ".rowSize = " + rowSize + ");\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + columnSize + ");\n");

                fileWriter.write("\tfor (int j = 0; j < " + totalSize + "; j++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\t" + op.answerName + ".data.push_back(1)\n");
                fileWriter.write("\t}\n\n");
            }
            if (op.operation.equals("Init_eye")) {
                fileWriter.write("\t// Initialization of matrix " + op.answerName + " by eye\n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);

                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }

                int size = Integer.parseInt(op.argumentNames.get(0));

                if (!exists) {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = size;
                    matrix.columnSize = size;

                    listener.matrixValues.put(op.answerName, matrix);
                } else {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = size;
                    listener.matrixValues.get(op.answerName).columnSize = size;
                }

                fileWriter.write("\t" + op.answerName + ".rowSize = " + size + ";\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + size + ";\n");

                fileWriter.write("\tfor (int j1 = 0; j1 < " + size + "; j1++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\tfor (int j2 = 0; j2 < " + size + "; j2++)\n");
                fileWriter.write("\t\t{\n");
                fileWriter.write("\t\t\tif(j1 == j2)\n");
                fileWriter.write("\t\t\t{\n");

                fileWriter.write("\t\t\t\t" + op.answerName + ".data.push_back(1)\n");
                fileWriter.write("\t\t\t}\n\t\t\telse\n\t\t\t{");
                fileWriter.write("\t\t\t\t" + op.answerName + ".data.push_back(0)\n");

                fileWriter.write("\t\t\t}\n");
                fileWriter.write("\t\t}\n");
                fileWriter.write("\t}\n\n");
            }
            if (op.operation.equals("Uminus_var")) {
                fileWriter.write("\t// Unary minus for variable " + op.answerName + " \n");

                boolean exists = listener.varValues.containsKey(op.answerName);

                if (exists)
                {
                    Variable var = listener.varValues.get(op.answerName);
                    if (var.toInit)
                    {
                        fileWriter.write("\tdouble " + op.answerName + " = -" + op.argumentNames.get(0) + ";\n\n");
                        var.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = -" + op.argumentNames.get(0) + ";\n\n");
                    }
                }
            }
            if (op.operation.equals("Uminus_matrix")) {
                fileWriter.write("\t// Unary minus for matrix " + op.answerName + " \n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);

                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }
                String inputName = op.argumentNames.get(0);
                Matrix in = listener.matrixValues.get(inputName);

                if (!exists) {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = in.rowSize;
                    matrix.columnSize = in.columnSize;

                    listener.matrixValues.put(op.answerName, matrix);
                } else {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = in.rowSize;
                    listener.matrixValues.get(op.answerName).columnSize = in.columnSize;
                }

                Matrix out = listener.matrixValues.get(op.answerName);

                fileWriter.write("\t" + op.answerName + ".rowSize = " + out.rowSize + ";\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + out.columnSize + ";\n");

                fileWriter.write("\tfor (int j1 = 0; j1 < " + out.rowSize + "; j1++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\tfor (int j2 = 0; j2 < " + out.columnSize + "; j2++)\n");
                fileWriter.write("\t\t{\n");

                fileWriter.write("\t\t\t" + op.answerName + ".data.push_back("+ inputName +".data[j2 + j1 * "+ op.answerName +".rowSize] * (-1));\n");


                fileWriter.write("\t\t}\n");
                fileWriter.write("\t}\n\n");
            }
            if (op.operation.equals("Transpose_matrix")) {
                fileWriter.write("\t// Transpose of matrix " + op.answerName + "\n");

                boolean exists = listener.matrixValues.containsKey(op.answerName);

                if (exists) {
                    // Если такая матрица уже есть, надо создать пустой экземпляр класса
                    Matrix m = listener.matrixValues.get(op.answerName);
                    if (m.toInit)
                    {
                        fileWriter.write("\tMatrix " + op.answerName + ";\n");
                        m.toInit = false;
                    }
                    else
                    {
                        fileWriter.write("\t" + op.answerName + " = new Matrix();\n");
                    }
                } else {
                    // Такого элемента еще не было, создаем новый
                    fileWriter.write("\tMatrix " + op.answerName + ";\n");
                }
                String inputName = op.argumentNames.get(0);
                Matrix in = listener.matrixValues.get(inputName);

                if (!exists) {
                    Matrix matrix = new Matrix();
                    matrix.rowSize = in.rowSize;
                    matrix.columnSize = in.columnSize;

                    listener.matrixValues.put(op.answerName, matrix);
                } else {
                    listener.matrixValues.get(op.answerName).data.clear();

                    listener.matrixValues.get(op.answerName).rowSize = in.rowSize;
                    listener.matrixValues.get(op.answerName).columnSize = in.columnSize;
                }

                Matrix out = listener.matrixValues.get(op.answerName);

                fileWriter.write("\t" + op.answerName + ".rowSize = " + out.rowSize + ";\n");
                fileWriter.write("\t" + op.answerName + ".columnSize = " + out.columnSize + ";\n");

                fileWriter.write("\tfor (int j1 = 0; j1 < " + out.rowSize + "; j1++)\n");
                fileWriter.write("\t{\n");
                fileWriter.write("\t\tfor (int j2 = 0; j2 < " + out.columnSize + "; j2++)\n");
                fileWriter.write("\t\t{\n");

                fileWriter.write("\t\t\t" + op.answerName + ".data.push_back("+ inputName +".data[j1 + j2 * "+ op.answerName +".rowSize]);\n");


                fileWriter.write("\t\t}\n");
                fileWriter.write("\t}\n\n");
            }
        }

        fileWriter.write("\treturn 0;\n}");
        fileWriter.flush();
    }
}
