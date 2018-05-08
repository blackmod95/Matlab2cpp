import java.util.ArrayList;

public class Operation {
    String operation;
    ArrayList<String> argumentNames;
    String answerName;

    Operation(String operation, ArrayList<String> argumentNames, String answerName) {
        this.operation = operation;
        this.argumentNames = argumentNames;
        this.answerName = answerName;
    }
}
