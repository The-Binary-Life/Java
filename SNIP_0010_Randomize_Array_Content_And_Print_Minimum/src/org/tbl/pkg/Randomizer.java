package org.tbl.pkg;

/**
 * @author The_Binary_Life
 */

public class Randomizer {
    public static void randomize(double[] val){
        for(int i = 0; i < val.length; i++){
            val[i] = Math.random() * 100.0;
        }
    }
}
