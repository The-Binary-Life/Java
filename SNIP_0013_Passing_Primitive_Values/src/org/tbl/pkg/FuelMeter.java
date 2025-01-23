package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */
public class FuelMeter {
    public double calcFuelPrice(double litres, double pricePerLitre){
        pricePerLitre = pricePerLitre + 2.25; //This changes the price by adding surcharge
        System.out.println("(Changing/Updating)Price per liter within calcFuelPrice: " + pricePerLitre);
        return litres * pricePerLitre;
    }
}
