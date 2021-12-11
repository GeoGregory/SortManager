package com.example.gg.sorters;

public class BubbleSorter implements Sortable {

    //sort() method from Sortable, which calls on private bubbleSort() method
    @Override
    public int[] sort(int[] array) {
        return bubbleSort(array);
    }

    //Sorts a given array using a bubbleSort sorting method, returns a sorted array
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
