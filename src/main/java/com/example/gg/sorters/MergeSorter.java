package com.example.gg.sorters;

import java.util.Arrays;

/**
 * This is a class to sort an array with a Merge sort algorthm, it also returns how long it took
 * <p>
 *     Implements the @{@link Sortable} interface
 * </p>
 */
public class MergeSorter implements Sortable{

    private long time;

    /**
     * Gives the user a message confirming which sorter has been chosen along with what the
     * array looks like before sorting. Then uses a private method to sort the array.
     * @param array Input array from @{@link com.example.gg.display.ArrayGen}.
     * @return Gives back a sorted array.
     */
    @Override
    public int[] sort(int[] array) {
        System.out.println("Sorting using the Merge Sorter");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));
        time = System.nanoTime();
        return mergeSort(array, array.length);
    }

    /**
     * Returns how long the sorter took to sort the algorithm.
     * @return Gives back the time in nanoseconds that the sorting algorithm took to sort the array.
     */
    @Override
    public long timeTaken() {
        return System.nanoTime() - time ;
    }

    // Splits the array into two arrays, then sends the three arrays to merge() along with two ints
    private int [] mergeSort(int[] array, int length) {

        if (length < 2) {
            return array;
        }
        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, length - mid);
        merge(array, l, r, mid, length - mid);
        return array;
    }

    // Sorts the given arrays using a mergeSort sorting method, returns a sorted array
    private int[] merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
        return array;
    }
}
