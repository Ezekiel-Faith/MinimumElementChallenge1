package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int len = readInteger();

        int[] element = readElement(len);
        System.out.println("_".repeat(20));
        System.out.println(Arrays.toString(element));

        int findMin = findMin(element);
        System.out.println("_".repeat(20));
        System.out.printf("Min of %s is: %d ", Arrays.toString(element), findMin);
    }

    private static int readInteger() {
        System.out.print("Enter length: ");
        return sc.nextInt();
    }

    private static int[] readElement(int len) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list of integers, separated by comma: ");
        String input = scanner.nextLine();

        String[] numberSplit = input.split(",");
        int[] numberArray = new int[len];

        for (int i = 0; i < len; i++) {
            try {
                numberArray[i] = Integer.parseInt(numberSplit[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + numberSplit[i]);
                numberArray[i] = 0; // or any other default value or handling strategy
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not enough numbers provided.");
                numberArray[i] = 0; // or any other default value or handling strategy
            }
        }

        scanner.close();
        return numberArray;

//        or
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter list of integers, separated by comma:");
//        String input = scanner.nextLine();
//
//        String[] numberSplit = input.split(",");
//        int[] numberString = new int[numberSplit.length];
//
//        for (int i = 0; i < len; i++) {
//            try {
//                numberString[i] = Integer.parseInt(numberSplit[i].trim());
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid number format: " + numberSplit[i]);
//                // Handle the error as needed, e.g., skip the invalid number or exit the program
//            }
////            numberString[i] = Integer.parseInt(numberSplit[i].trim());
//        }
//
//        return numberString;
    }

    private static int findMin(int[] array) {
        int minArr = Integer.MAX_VALUE;

        for(int element : array) {
            if(element < minArr) {
                minArr = element;
            }
        }

        return minArr;
    }
}
