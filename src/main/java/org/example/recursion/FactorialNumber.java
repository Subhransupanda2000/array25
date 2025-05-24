package org.example.recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        int n=5;
        int res=fact(n);
        System.out.println(res);
    }

    private static int fact(int n) {
        int result=1;
        if (n==1){
            return result;
        }
         result=n*fact(n-1);
        return result;
    }
}
