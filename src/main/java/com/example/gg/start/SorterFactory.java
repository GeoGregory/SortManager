package com.example.gg.start;

import com.example.gg.sorters.BubbleSorter;
import com.example.gg.sorters.MergeSorter;
import com.example.gg.sorters.Sortable;

public class SorterFactory {
    public static Sortable getSort(int choice){
        return switch (choice) {
            case 1 -> new BubbleSorter();
//            case 2 -> new BinaryTreeSorter();
            case 3 -> new MergeSorter();
            default -> null;
        };
    }
}
