package org.mohinur;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number ");
        int start = sc.nextInt();
        System.out.println("Enter end number ");
        int end = sc.nextInt();
        sc.close();


//        int count = 0;
//        int total = 0;
        for (int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.println(i);
//                count ++;
//                total += i;
            }
        }
//        System.out.println("number of  prime : " + count + " and total of prime : " + total);

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
