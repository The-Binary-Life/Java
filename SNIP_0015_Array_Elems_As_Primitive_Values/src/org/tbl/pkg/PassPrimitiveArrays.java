package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class PassPrimitiveArrays {
    public static void main(String[] args) {
        int[] dataSeq = {10,15,105,99,102,9};  //Let us create and initialize one array containing primitive types

        //Lets pass this array to the print method
        printPrimitiveArray(dataSeq);

        //Let us try to find the biggest element in this array and put it at the last location
        for(int i = 1; i < dataSeq.length; i++){
            if(dataSeq[i-1] > dataSeq[i])
                swapElements(dataSeq, i - 1, i);
        }

        //Lets print out the array once again, and see the max element being pushed to the last in a single pass
        printPrimitiveArray(dataSeq);
    }

    private static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printPrimitiveArray(int[] array) {
        for(int val : array)
            System.out.print(" " + val);
        System.out.println();
    }
}
