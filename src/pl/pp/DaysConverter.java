package pl.pp;

import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // PART 1: DAYS CONVERTER
        // =========================
        while (true) {
            System.out.print("Enter number of days (<=0 to exit): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Days program finished.\n");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days\n");
        }

        // =========================
        // PART 2: TEMPERATURE CONVERTER
        // =========================
        while (true) {
            System.out.print("Enter temperature in Celsius (-1 to exit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Temperature program finished.");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f\n\n",
                    celsius, fahrenheit, kelvin);
        }

        scanner.close();
    }
}