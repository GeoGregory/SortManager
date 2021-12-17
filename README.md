# Sort Manager
# Table of contents

* [Introduction](#introduction)
* [Project Requirements](#project-requirements)
* [How it works](#how-it-works)

## Introduction:
The sort manager is a program that lets users sort a list of random numbers with the sorting method that they choose, 
along with how long it took to sort.

The program allows the user to pick from a list of sorting algorithms that the user wishes to use, 
alongside how long they want the list of numbers to be.   

This program is a project I (George Gregory) created while training with Sparta Global.

## Project Requirements:
The following is a summary of the requirements for the project:

You will be building a program that will allow a user to sort a randomised array. The general flow of the application is:
1. The user is presented with a number of sort algorithms to choose from
2. Decision is given via the command line (Scanner)
3. The program will then ask for the length of an array again via the command line (Scanner)
4. The program should then output:
- The unsorted randomly generated array
- The sort algorithm to be used
- The sorted array after the algorithm has been executed
- The time taken

You are required to test both the functionality of the program and the performance of the algorithms (speed tests)

You should include but are not limited to:
- BubbleSort
- MergeSort (iterative or recursive)
- BinaryTreeSort

## How it works:
The program works by asking what sorting method the user wants to use, the choice is then sent to the
corresponding sorter, where it is initiated.

The program then asks the user to choose the length of the list of numbers, the user may input any value from 1 to 100,
the length is then send to an array generator that creates a list of random numbers to the length of the users' selection.

Both answers are checked to see if they are correct values. Incorrect values could be letters, special characters 
or numbers outside the possible parameters

The user is then shown what the list of numbers looks like before being sorted. The list is then sent to the 
corresponding sorter and the user is presented with the list again but sorted along with how long in nanoseconds 
the sorter took to sort it.

