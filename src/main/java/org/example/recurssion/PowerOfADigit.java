package org.example.recurssion;

public class PowerOfADigit {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int ans = calc(x, n);
        System.out.println(ans);
    }

    private static int calc(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return calc(x, n / 2) * calc(x, n / 2);

        } else
            return calc(x, n / 2) * calc(x, n / 2) * x;
    }
}
