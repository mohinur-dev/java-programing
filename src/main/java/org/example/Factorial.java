package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int factorial = findFactorial(input);
        System.out.println("the factorial of " + input + " is : " + factorial);
    }
    public static int findFactorial(int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
