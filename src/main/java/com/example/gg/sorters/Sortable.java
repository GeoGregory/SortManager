package com.example.gg.sorters;

/**
 * This is an interface that the sorters use so that when they are called through the factory,
 * they all will achieve the same outcome.
 */
public interface Sortable {

    /**
     * Sorting method that all sorters implement.
     * @param array Takes an array that is generated though @{@link com.example.gg.display.ArrayGen}.
     * @return Gives back a sorted array using the appropriate sorting method.
     */
    int[] sort(int [] array);

    /**
     * A time taken method that all sorter implement.
     * @return Gives back how long the sorter took to sort the array.
     */
    long timeTaken();
}
