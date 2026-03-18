package pl.pp;

import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number of days (<=0 to exit):");
            int days = scanner.nextInt();

            // programı bitirme şartı
            if (days <= 0) {
                System.out.println("Program finished.");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is "
                    + weeks + " weeks and "
                    + remainingDays + " days");
        }

        scanner.close();
    }
}