package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class FindMinIn2DArray {
    public static void main(String[] args) {
        //Let us first declare a 2D array
        int[][] array2D = { //This array contains other arrays as its elements
                {45,34,10},     //3 elements
                {11,10,56,89},  //4 elements
                {5,4,3,2,1,7}   //6 elements
        };

        //Now let us try to find the minimum in this 2D array
        int globalMin = array2D[0][0]; //Assuming the first element of the first sub array as the current minimum

        //Since we have to loop over all the elements of the array
        for(int i = 0; i < array2D.length; i++){
            //Since we have to loop over each of the subarrays
            //Passing the subarray to a method to give us the minimum in it
            int rowMinimum = findMinimum(array2D[i]);
            System.out.println("Row[" + i + "] minimum: " + rowMinimum);
            if(rowMinimum < globalMin) globalMin = rowMinimum;
        }

        System.out.println("The min value = " + globalMin);
    }

    private static int findMinimum(int[] array) {
        int min = array[0];
        for(int val: array){
            min = Math.min(min, val);
        }
        return min;
    }
}
