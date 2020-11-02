package wethinkcode.computerV1.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
    public List<Expression> expressions = new ArrayList<>();
    public List<Operation> operations = new ArrayList<>();

    public void printPoly(){
        int expressionPos = 0;
        int variablePos = 0;
        while (expressionPos < expressions.size()){
            System.out.print(expressions.get(expressionPos).value);
            while (variablePos < expressions.get(expressionPos).variableList.size()){
                System.out.print(" * ");
                System.out.print(expressions.get(expressionPos).variableList.get(variablePos).name);
                System.out.print("^");
                System.out.print(expressions.get(expressionPos).variableList.get(variablePos).power);
                variablePos++;
            }
            if (expressionPos < operations.size()){
                System.out.print(" " + operations.get(expressionPos).op + " ");
            }
            variablePos = 0;
            expressionPos++;
        }
        System.out.println("");
    }
}
