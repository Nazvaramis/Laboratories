package com.example.rtsllab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab1ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
        }

        // Sort the array
        Arrays.sort(randomNumbers);

        // Display the sorted numbers
        System.out.println("Sorted random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

        // Close the scanner
        scanner.close();
    }
}

