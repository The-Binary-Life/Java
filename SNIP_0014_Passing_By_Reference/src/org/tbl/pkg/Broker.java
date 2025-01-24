package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class Broker {
    public static void main(String[] args) {
        MutualFund newMutualFund = setupNewMutualFund(); //newMutualFund is the object reference

        System.out.println("Current fund details: " + newMutualFund);

        //Simulating stock market crash
        simulateStockMarketCrash(newMutualFund); //This is being passed as reference
                                                // hence any change the method does to this, will be reflected
                                                // in main method

        //Printing out the fund details after crash
        System.out.println("Current fund details after stock market crash: " + newMutualFund); //The change is reflected here

    }

    public static MutualFund setupNewMutualFund(){
        MutualFund mutualFund = new MutualFund();
        mutualFund.setName("Kotak Mantra");
        mutualFund.setCurrentValue(412456.78);
        return mutualFund;
    }

    public static void simulateStockMarketCrash(MutualFund mutualFund){
        mutualFund.setCurrentValue(378198.98);
    }
}
