package org.example.recurssion;

public class Main {
    public static void main(String[] args) {
        int n=10;
        int fact=1;
        int ans=findFactorial(n,fact);
        System.out.println(ans);
    }

    private static int findFactorial(int n,int fact) {
        if (n==1||n==0){
            return fact;
        }
         fact*=n;
        return findFactorial(n-1,fact);

    }
}
