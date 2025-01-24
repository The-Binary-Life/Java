package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class MutualFund {
    private String name;
    private double currentValue;

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public String toString(){
        return "MF Name: " + name + ", Current Value: INR " + currentValue;
    }
}
