package org.mohinur;

import java.util.Scanner;

public class AlphabeticSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine().toUpperCase();
        while (name != "STOP") {
            countAlphabeticSum(name);
        }


        scanner.close();
    }

    static void countAlphabeticSum(String name) {
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {
                sum += ch - 'A' + 1;
            }
        }

        System.out.println("The sum of the alphabetic positions in the name is: " + sum);
    }
}
