package com.example.gg.display;

import java.util.Arrays;
import java.util.Scanner;

public class Printer {

    // Asks the user to choose one of the following options, and then calls on getAnswer()
    public int getChoice() {
        System.out.println("Please enter the number of the sorter you want to use:");
        System.out.println("1. BubbleSorter");
        System.out.println("2. MergeSorter");
        System.out.println("3. BinarySorter");
        return getAnswer("Choice");
    }


    // Asks the user to enter the length they want the array to be and then calls on getAnswer()
    public int getLength() {
        System.out.println("Please enter the length of the array you want to generate from 1 to 100:");
        return getAnswer("Length");
    }

    // Uses a scanner to get the users input and sends the information to checkAnswer()
    private int getAnswer(String input) {
        Scanner s = new Scanner(System.in);
        int answer = s.nextInt();
        Integer Choice = checkAnswer(input, answer);
        if (Choice != null) return Choice;
        return answer;
    }

    // Checks the users answer by using a String from the appropriate method along with the user input
    // Each answer has different boundaries which are checked
    private Integer checkAnswer(String input, int answer) {
        if (input.equals("Choice") && (answer > 3 ) || input.equals("Choice") && (answer <= 0 )) {
            System.out.println("The choice made is not on the list, please try again:");
            return getAnswer("Choice");
        }
        if (input.equals("Length") && (answer >= 100 || answer <= 0)) {
            System.out.println("The choice made is outside of 1 to 100, please try again:");
            return getAnswer("Length");
        }
        return null;
    }

    // Takes the sorted array and prints the result for the user
    public void finalPrint(int [] generatedArray){
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(generatedArray));
    }
}
