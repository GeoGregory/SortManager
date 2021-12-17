package com.example.gg.display;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a class to generate sout's that the user will see and interact with.
 */
public class  Printer {

    /**
     * Asks the user to choose one of the available sorters, checks the answer is a valid choice using a private method.
     * @return Gives back an int which the @{@link com.example.gg.start.SorterFactory} uses.
     */
    public static int getChoice() {
        System.out.println("Please enter the number of the sorter you want to use:");
        System.out.println("1. BubbleSorter");
        System.out.println("2. BinarySorter");
        System.out.println("3. MergeSorter");
        return getAnswer("Choice");
    }

    /**
     * Asks the user to select how long the array generated should be, checks the answer is a valid choice using a private method.
     * @return Gives back an int which the @{@link ArrayGen} uses.
     */
    public static int getLength() {
        System.out.println("Please enter the length of the array you want to generate from 1 to 100:");
        return getAnswer("Length");
    }

    // Uses a scanner to get the users input making sure it's an int and sends the information to checkAnswer()
    private static int getAnswer(String input) {
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()) {
            s.next();
            System.out.print("Please enter a valid number: ");
        }
        int answer = s.nextInt();
        Integer Choice = checkAnswer(input, answer);
        if (Choice != null) return Choice;
        return answer;
    }

    // Checks the users answer by using a String from the appropriate method along with the user input
    // Each answer has different boundaries which are checked
    private static Integer checkAnswer(String input, int answer) {

        if (input.equals("Choice") && (answer > 3 ) || input.equals("Choice") && (answer <= 0 )) {
            System.out.println("The choice made is not on the list, please try again:");
            return getAnswer("Choice");
        }
        if (input.equals("Length") && (answer > 100 || answer <= 0)) {
            System.out.println("The choice made is outside of 1 to 100, please try again:");
            return getAnswer("Length");
        }
        return null;
    }

    /**
     * Returns the sorted array for the user to see.
     * @param generatedArray sorted array from the selected sorter.
     */
    public static void finalPrint(int [] generatedArray){
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(generatedArray));
    }

    /**
     * Returns the time in nanoseconds that the sorter took.
     * @param time long from the selected sorter.
     */
    public static void printTime(long time) {
        System.out.println("Execution time in nanoseconds: " + time );
    }
}
