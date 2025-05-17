package org.example.array;
public class StockBuySell{
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int res=findHighesttransation(prices);
        System.out.println(res);
    }

    private static int findHighesttransation(int[] prices) {
        int result=0;
        for (int i=0;i<=prices.length-1;i++){
            for(int j=i+1;j<= prices.length-1;j++){
               result= Math.max(result,prices[j]-prices[i]);
            }
        }
        return result;
    }
}