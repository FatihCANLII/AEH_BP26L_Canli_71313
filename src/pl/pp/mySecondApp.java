package pl.pp;

import java.util.Scanner;

public class mySecondApp {

    public static void main(String[] args) {

        // Task 2 - Part 1
        int x = 10;
        int doubleX = x * 2;
        int squareX = x * x;

        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleX);
        System.out.println("Square of x = " + squareX);

        // Task 2 - Part 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        int ageInSeconds = age * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}