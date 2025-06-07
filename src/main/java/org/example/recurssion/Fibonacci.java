package org.example.recurssion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        createSerise(a,b,n-2);
    }

    private static void createSerise(int a, int b, int n) {
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c+" ");
        a=b;
        b=c;
        createSerise(a,b,n-1);

    }
}
