package com.example.gg.sorters;

import java.util.Arrays;

public class MergeSorter implements Sortable{

    // sort() method from Sortable, which calls on private mergeSortSort() method
    @Override
    public int[] sort(int[] array) {
        System.out.println("Sorting using the Merge Sorter");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));
        return mergeSort(array, array.length);
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
            }
            else {
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
