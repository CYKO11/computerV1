package wethinkcode.computerV1;

import wethinkcode.computerV1.dataStructure.Polynomial;

public class Main {
    public static void main(String[] args){
        Polynomial[] polyExpression = new Builder().buildPoly(args[0]);
        polyExpression[0].printPoly();
        polyExpression[1].printPoly();
    }
}
