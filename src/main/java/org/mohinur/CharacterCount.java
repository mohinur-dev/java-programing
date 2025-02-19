package org.mohinur;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Error: Name cannot be empty.");
                return;
            }

            int characterCount = name.length();

            System.out.println("Your name is \"" + name + "\" and it contains " + characterCount + " characters.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}