package org.example.array;

public class FinalSumSingleDigit {
    public static void main(String[] args) {
        int digit = 12345;
        while (digit>= 10) {
            digit = finalSum(digit);
        }
        System.out.println(digit);

    }

    private static int finalSum(int digit) {
        int sum = 0;

        while (digit > 0) {
            int n = digit % 10;
            sum += n;
            digit = digit / 10;
        }
        return sum;

    }
}
