package pl.pp;

import java.io.*;
import java.util.*;

public class myThirteenthApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String inputPath;
        File inputFile;

        while (true) {
            System.out.print("Enter input file path: ");
            inputPath = keyboard.nextLine();

            inputFile = new File(inputPath);

            if (inputFile.exists()) {
                break;
            }

            System.out.println("File does not exist. Try again.");
        }

        System.out.print("Enter output file path: ");
        String outputPath = keyboard.nextLine();

        int totalWords = 0;

        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String line = reader.readLine();

            while (line != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.toLowerCase();

                    if (!word.isEmpty()) {
                        totalWords++;

                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }

                line = reader.readLine();
            }

            reader.close();

            System.out.println();
            System.out.println("File name: " + inputFile.getName());
            System.out.println("Total words: " + totalWords);
            System.out.println();

            for (String word : wordCount.keySet()) {
                System.out.println(word + " : " + wordCount.get(word));
            }

            PrintWriter writer = new PrintWriter(outputPath);

            writer.println("File name: " + inputFile.getName());
            writer.println("Total words: " + totalWords);
            writer.println();

            for (String word : wordCount.keySet()) {
                writer.println(word + " : " + wordCount.get(word));
            }

            writer.close();

            System.out.println();
            System.out.println("Results saved to output file.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }

        keyboard.close();
    }
}