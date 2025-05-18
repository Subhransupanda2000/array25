package org.example.array;


public class MissingNumber {
    public static void main(String[] args) {
        int[]arr={1,3,0,2,5,6,4,8};
        int missing=missingNumber(arr);
        System.out.println(missing);
    }

    private static int missingNumber(int[] arr) {
        int givensum=0;
        for (int i=0;i<=arr.length-1;i++){
            givensum+=arr[i];
        }
        int actualSum=(arr.length*(arr.length+1))/2;
        int missing=actualSum-givensum;
        return missing;

    }
}
