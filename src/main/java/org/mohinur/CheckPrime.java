package org.mohinur;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        if(isPrime(input)) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not prime number");
        }

    }

    public static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i < input; i ++) {
            if(input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
