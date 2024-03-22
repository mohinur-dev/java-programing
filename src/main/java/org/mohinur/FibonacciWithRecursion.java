package org.mohinur;

import java.util.Scanner;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series ");
        for (int i = 0; i <= input; i++) {
            System.out.println(createFibonacciSeries(i));
        }
    }
    public static int createFibonacciSeries(int input) {
       if (input <= 1) {
           return input;
       } else {
           return createFibonacciSeries(input -1) + createFibonacciSeries(input -2);
       }
    }
}
