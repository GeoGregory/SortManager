package com.example.gg.start;

import com.example.gg.sorters.BinarySorter;
import com.example.gg.sorters.BubbleSorter;
import com.example.gg.sorters.MergeSorter;
import com.example.gg.sorters.Sortable;

/**
 * This is a class for building Sorters.
 * <p>
 *     Uses the factory pattern
 * </p>
 */
public class SorterFactory {
    /**
     * Using the factory pattern, the user is able to select which sorting method they wish to use.
     * @param choice String that the user gives to select which sort method they would like to use.
     * @return Gives back the sort class which implements @{@link Sortable}.
     */
    public static Sortable getSort(int choice){
        return switch (choice) {
            case 1 -> new BubbleSorter();
            case 2 -> new BinarySorter();
            case 3 -> new MergeSorter();
            default -> null;
        };
    }
}
