package pl.pp;

import java.util.Scanner;

public class mySixthApp {

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        long startIterative = System.nanoTime();
        long iterativeResult = factorialIterative(n);
        long endIterative = System.nanoTime();

        long startRecursive = System.nanoTime();
        long recursiveResult = factorialRecursive(n);
        long endRecursive = System.nanoTime();

        long iterativeTime = endIterative - startIterative;
        long recursiveTime = endRecursive - startRecursive;

        System.out.println("Iterative factorial: " + iterativeResult);
        System.out.println("Iterative time: " + iterativeTime + " ns");

        System.out.println("Recursive factorial: " + recursiveResult);
        System.out.println("Recursive time: " + recursiveTime + " ns");

        scanner.close();
    }
}