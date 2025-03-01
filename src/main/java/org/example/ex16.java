package org.example;

import java.util.Scanner;

public class ex16 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        double[] numbers = new double[10]; // Create an array of length 10

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Invoke bubblesort method
        bubbleSort(numbers);

        // display the sorted numbers
        for (double e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /** bubbleSort */
    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                // If a neighboring pair is not in order, swap values
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped); // Repeat if a value was swapped
    }
}