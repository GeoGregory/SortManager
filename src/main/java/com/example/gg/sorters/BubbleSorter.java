package com.example.gg.sorters;

import java.util.Arrays;

/**
 * This is a class to sort an array with a Bubble sort algorithm, it also returns how long it took.
 * <p>
 *     Implements the @{@link Sortable} interface.
 * </p>
 */
public class BubbleSorter implements Sortable {

    private long time;

    /**
     * Gives the user a message confirming which sorter has been chosen along with what the
     * array looks like before sorting. Then uses a private method to sort the array.
     * @param array Input array from @{@link com.example.gg.display.ArrayGen}.
     * @return Gives back a sorted array.
     */
    @Override
    public int[] sort(int[] array) {
        System.out.println("Sorting using the Bubble Sorter");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));
        time = System.nanoTime();
        return bubbleSort(array);
    }

    /**
     * Returns how long the sorter took to sort the algorithm.
     * @return Gives back the time in nanoseconds that the sorting algorithm took to sort the array.
     */
    @Override
    public long timeTaken() {
        return System.nanoTime() - time;
    }

    private int[] bubbleSort(int[] sortArr) {
        int n = sortArr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (sortArr[j] > sortArr[j+1]) {
                    int tempNum = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = tempNum;
                }
        return sortArr;
    }
}
