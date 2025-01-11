package com.tbl.pkg;

public class Account { //Class name
    //Class Declarations:
    //Instance Fields:
    private String accountType;
    private String accountId;

    //Static Fields:
    private static int instanceCounter;

    //Constructor:
    public Account(String accountId, String accountType){
        this.accountType = accountType;
        this.accountId = accountId;
        instanceCounter++; //Whenever an object is created, this field is incremented at the class level
    }

    //Methods:
    @Override
    //Instance Methods
    public String toString(){
        return "Overridden toString method called: com.tbl.pkg.Account type: " + accountType + ", com.tbl.pkg.Account ID: " + accountId;
    }

    //Static methods
    public static void main(String[] args) {
        Account oldAccount = new Account("CR0012", "Current");
        System.out.println("Object No: " + getInstanceCounter()); //This will print 1
        System.out.println("Original account details: " + oldAccount);

        Account newAccount = new Account("CR0020", "Savings");

        System.out.println("Object No: " + getInstanceCounter()); //This will print 2
        System.out.println("New account details: " + newAccount);
    }

    public static int getInstanceCounter(){
        return instanceCounter;
    }
}
