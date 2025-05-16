package org.example.array;

import java.util.Arrays;

public class WaveFormArray {
    public static void main(String[] args) {
        int[]arr= {10, 5, 6, 3, 2, 20, 100, 80};
        int n=arr.length;
        result(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void result(int[] arr, int n) {
        for (int i=1;i<n;i+=2){
            if (arr[i]>arr[i-1]){
                swap(i,i-1,arr);
            }
            if (i+1<n &&arr[i]>arr[i+1] ){
                swap(i,i+1,arr);
            }

        }
    }
    public static void swap(int left,int right,int []arr){
     int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;

    }
}
