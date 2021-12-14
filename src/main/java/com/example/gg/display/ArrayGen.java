package com.example.gg.display;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayGen {

    // Calls on the private genArray() with an int as an argument,
    // which correlates to the length of the array being made
    public int[] startGen(int number) {
        return genArray(number);
    }

    // Generates an array with the length of the argument provided using the ThreadLocalRandom class,
    // the array will only generate values lower than 999.
    private int[] genArray(int lengthOfArray) {
        final int maxVal = 999;
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, maxVal);
        }
        return arr;
    }
}
