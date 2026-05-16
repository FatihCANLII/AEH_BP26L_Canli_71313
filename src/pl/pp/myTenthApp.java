package pl.pp;

import java.util.Arrays;

public class myTenthApp {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, -3, -2, -1};

        int[] result = countAndSumElements(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] countAndSumElements(int[] input) {

        if (input == null || input.length == 0) {
            return new int[] {};
        }

        int negativeNumbers = 0;
        int positiveSum = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] < 0) {
                negativeNumbers++;
            }

            if (input[i] > 0) {
                positiveSum = positiveSum + input[i];
            }
        }

        int[] result = new int[2];

        result[0] = negativeNumbers;
        result[1] = positiveSum;

        return result;
    }
}