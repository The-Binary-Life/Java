package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */
public class PetrolPump {
    public static void main(String[] args) {
        FuelMeter fuelMeter = new FuelMeter();
        double pricePerLiter = 107.25;
        double totalPrice = fuelMeter.calcFuelPrice(12, pricePerLiter);

        System.out.println("(Unchanged)Value of pricePerLiter: " + pricePerLiter); //This remains unchanged
        System.out.println("Total price: " + totalPrice);
    }
}
