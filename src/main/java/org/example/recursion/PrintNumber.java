package org.example.recursion;

public class PrintNumber {
    public static void main(String[] args) {
        int n = 5;
        result(n);
    }

    private static void result(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        result(n - 1);
    }
}
