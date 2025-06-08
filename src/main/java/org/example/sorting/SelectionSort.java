package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={8,1,7,2,6,4,3,9,5};
        result(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void result(int[] arr) {

        for (int i=0;i<=arr.length-1;i++){
            int min= i;
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[min]<arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
}
