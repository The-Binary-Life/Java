package org.tbl.pkg;

import java.util.StringJoiner;

public class AnonymousArrays {
    public static void main(String[] args) {
        System.out.println("Length of anonymous int array: " + (new int[]{1, 2, 3, 4, 5}).length);

        concatenateStrings(new String[]{"Today", "is", "my", "lucky", "day"});

        /*
        Few more examples

        // anonymous char array
        new char[] {'x', 'y', 'z'};

        // anonymous multidimensional array
        new int[][] { {3, 7}, {10, 22, 11}, {10} };
         */
    }

    private static void concatenateStrings(String[] words) {
        StringJoiner newString = new StringJoiner(", ");
        for (String word : words) {
            newString.add(word);
        }
        System.out.println("Joined string: " + newString);
    }
}
