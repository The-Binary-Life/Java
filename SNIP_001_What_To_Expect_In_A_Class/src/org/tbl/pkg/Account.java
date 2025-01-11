package org.tbl.pkg;

public class Account { //Class name
    //Class Declarations:
    //Fields:
    private String accountType;
    private String accountId;

    //Constructor:
    public Account(String accountId, String accountType){
        this.accountType = accountType;
        this.accountId = accountId;
    }

    //Methods:
    @Override
    //Instance Methods
    public String toString(){
        return "Overridden toString method called: com.tbl.pkg.Account type: " + accountType + ", com.tbl.pkg.Account ID: " + accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    //Static methods
    public static void main(String[] args) {
        Account newAccount = new Account("CR0012", "Current");

        System.out.println("Original account details: " + newAccount);

        newAccount.setAccountId("CR0020");
        newAccount.setAccountType("Savings");

        System.out.println("Updated account details: " + newAccount);
    }
}
