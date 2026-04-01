package pl.pp;

public class myFifthApp {

    public static void main(String[] args) {

        // Using the method
        printCharacter('*', 5, 3);
        System.out.println();
        printCharacter('#', 10, 4);

    }

    // Method that takes three arguments:
    // character -> character to display
    // count -> how many times the character should be printed in a row
    // lines -> how many lines should be printed
    public static void printCharacter(char character, int count, int lines) {

        for (int i = 0; i < lines; i++) {           // loop for lines
            for (int j = 0; j < count; j++) {       // loop for characters in one row
                System.out.print(character);
            }
            System.out.println(); // move to next line
        }

    }
}