package pl.pp;

import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        runSquareSumProgram(scanner);
        runCalculatorProgram(scanner);

        scanner.close();
    }

    public static void runSquareSumProgram(Scanner scanner) {
        boolean firstInput = true;

        while (true) {
            int lowerLimit;
            int upperLimit;

            if (firstInput) {
                System.out.print("Enter lower and upper integer limits: ");
                firstInput = false;
            } else {
                System.out.print("Enter next set of limits: ");
            }

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            lowerLimit = scanner.nextInt();

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Done");
                break;
            }

            long sumOfSquares = 0;

            for (int i = lowerLimit; i <= upperLimit; i++) {
                sumOfSquares += (long) i * i;
            }

            System.out.println("The sums of the squares from " +
                    (lowerLimit * lowerLimit) + " to " +
                    (upperLimit * upperLimit) + " is " + sumOfSquares);
        }
    }

    public static void runCalculatorProgram(Scanner scanner) {
        int choice;

        do {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid menu option. Please enter a number from 0 to 4.");
                scanner.next();
                System.out.print("Choose an option: ");
            }

            choice = scanner.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid menu option. Please choose from 0 to 4.");
                continue;
            }

            if (choice == 0) {
                System.out.println("Program ended.");
                break;
            }

            double firstNumber;
            double secondNumber;

            System.out.print("Enter the first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter the first number: ");
            }
            firstNumber = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter the second number: ");
            }
            secondNumber = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Error: division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    }
                    break;
            }

        } while (true);
    }
}