package org.tbl.pkg;

public class OperationClient {
    public static void main(String[] args) {
        // Sample data
        int num1 = 10;
        int num2 = 4;

        //We would like to perform addition
        Operation addition = Operation.ADDITION;
        addition.solve(num1, num2);

        //We would like to perform subtraction
        Operation subtraction = Operation.SUBTRACTION;
        subtraction.solve(num1, num2);

        System.out.println("Same thing is now achieved by for loop");
        //Same thing can be achieved by just iterating over the values of Operation enumeration
        for(Operation op : Operation.values()){
            op.solve(num1, num2);
        }
    }
}
