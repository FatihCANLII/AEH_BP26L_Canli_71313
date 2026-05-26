package pl.pp;

import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPath;
        String outputPath;

        while (true) {
            System.out.print("Enter input file path: ");
            inputPath = scanner.nextLine();

            File file = new File(inputPath);

            if (file.exists()) {
                break;
            } else {
                System.out.println("File not found. Try again.");
            }
        }

        System.out.print("Enter output file path: ");
        outputPath = scanner.nextLine();

        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));

            String line = reader.readLine();

            while (line != null) {
                lineCount++;
                line = reader.readLine();
            }

            reader.close();

            System.out.println("Number of lines: " + lineCount);

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            writer.write("File name: " + inputPath);
            writer.newLine();
            writer.write("Number of lines: " + lineCount);

            writer.close();

            System.out.println("Result saved.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        scanner.close();
    }
}