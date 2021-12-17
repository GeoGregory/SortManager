package com.example.gg.display;

import com.example.gg.sorters.Sortable;
import com.example.gg.start.SorterFactory;

/**
 * A class that loads and interacts with all classes needed for sortManager to work.
 */
public class SorterLoader {
    /**
     * Connects all the methods and classes needed for the sort manager.
     */
    public static void load() {
        Sortable sortChoice = SorterFactory.getSort(Printer.getChoice());
        Printer.finalPrint(sortChoice.sort(ArrayGen.startGen(Printer.getLength())));
        Printer.printTime(sortChoice.timeTaken());
    }
}
