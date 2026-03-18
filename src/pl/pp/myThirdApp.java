package pl.pp;

import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 100:");

        // WHILE loop
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("The number is not greater than 100, enter again:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Thank you! You’ve entered: " + number1);

        // DO..WHILE loop
        double number2;
        do {
            System.out.println("Enter a number greater than 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Thank you! You’ve entered: " + number2);

        // FOR loop
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Iteration no. " + i +
                    " result (wynik) = " + wynik);
        }

        // IF..ELSE
        System.out.println("Enter the value of x:");
        var x = scanner.nextDouble();

        System.out.println("Enter the value of y:");
        var y = scanner.nextDouble();

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x equals y");
        }

        // Exit with -1
        while (true) {
            System.out.println("Enter -1 to exit the program");
            var input = scanner.nextDouble();

            if (input == -1) {
                System.out.println("Exit...");
                break;
            }
        }

        scanner.close();
    }
}