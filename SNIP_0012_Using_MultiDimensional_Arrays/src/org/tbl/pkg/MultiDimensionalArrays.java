package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //Let us create a multidimensional array of M x N
        int[][] multiArray = {
                {5, 10, 9},     //row 1
                {11, 22, 100},  //row 2
                {19,67,12},     //row 3
                {4,9,25}        //row 4
        }; // 4 x 3 integer matrix

        //We will now try to find the minimum within this 2D array
        //Assuming the row[0]col[0] element which is 5, to be the smallest at the beginning of the loops
        int smallest = multiArray[0][0];
        int largest = multiArray[0][0];

        //Iterating over each row
        for(int i = 0; i < multiArray.length; i++){
            //Iterating over each column within a specific row
            for(int j = 0; j < multiArray[i].length; j++){
                smallest = Math.min(smallest, multiArray[i][j]);
                largest = Math.max(largest,multiArray[i][j]);
            }
        }

        System.out.println("The smallest element of the entire array is: " + smallest);
        System.out.println("The largest element of the entire array is: " + largest);
    }
}
