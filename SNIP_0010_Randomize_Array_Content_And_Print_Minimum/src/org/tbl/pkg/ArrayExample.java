package org.tbl.pkg;

import static org.tbl.pkg.Randomizer.randomize;

/**
 * @author The_Binary_Life
 */

public class ArrayExample {
    private static final int ARRAY_NUM = 5;
    private static final int ARRAY_CAPACITY = 10;
    public static void main(String[] args) {
        // Declare and construct the local arrays
        double[] minValuesFromArray = new double[ARRAY_NUM];
        double[] randomValsArray = new double[ARRAY_CAPACITY];

        //Iterate over minValuesFromArray length to create random arrays and then
        //store the minimum values of each in the minValuesFromArray
        for(int i = 0; i < ARRAY_NUM; i++){
            // initialize the array
            randomize(randomValsArray);

            //Find the minimum value
            minValuesFromArray[i] = getMinimumValue(randomValsArray);
        }

        displayArray(minValuesFromArray);
    }

    private static void displayArray(double[] minValuesFromArray) {
        for (double val : minValuesFromArray) {
            System.out.printf("%.4f%n",val);
        }
        System.out.println();
    }

    public static double getMinimumValue(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            min = Math.min(min, array[i]);
        }
        return min;
    }
}
