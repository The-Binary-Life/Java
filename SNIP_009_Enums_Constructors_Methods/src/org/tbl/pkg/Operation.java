package org.tbl.pkg;

public enum Operation {
    ADDITION("+") {
        @Override
        public void solve(int num1, int num2) {
            System.out.println("num1 + num2 = " + (num1 + num2));
        }
    },
    SUBTRACTION("-") {
        @Override
        public void solve(int num1, int num2){
            System.out.println("num1 - num2 = " + (num1 - num2));
        }
    };
    private final String operationCode;

    //Constructor
    Operation(String opCode){
        this.operationCode = opCode;
    }

    //Abstract method declaration which can be different for each constant
    public abstract void solve(int num1, int num2);

    //Custom toString implementation to print out the operation
    @Override
    public String toString(){
        return operationCode;
    }

    //getter methods
    public String getOperationCode(){
        return this.operationCode;
    }

    //static method
    public static void sampleStaticMethod(){
        System.out.println("The static method was called");
    }
}
