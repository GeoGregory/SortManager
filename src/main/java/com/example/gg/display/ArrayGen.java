package com.example.gg.display;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a class to generate an array with random integers, the length of the array is set by the user.
 */
public class ArrayGen {

    /**
     * Generates an array with the length of the argument provided using the ThreadLocalRandom class,
     * the array will only generate values lower than 1000.
     * @param number Input int from @{@link com.example.gg.display.Printer}
     * @return Gives back an array generated from genArray() with the length defined by the user.
     */
    public static int[] startGen(int number) {
        return genArray(number);
    }

    private static int[] genArray(int lengthOfArray) {
        final int maxVal = 999;
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, maxVal);
        }
        return arr;
    }
}
