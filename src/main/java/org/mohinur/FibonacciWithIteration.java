package org.mohinur;

import java.util.Scanner;

public class FibonacciWithIteration {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        createFibonacciSeries(input);
    }

    public static void createFibonacciSeries(int input) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < input; i++) {
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
