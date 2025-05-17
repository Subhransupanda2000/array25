package org.example.array;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};int ele=2;
        int res=removeElement(arr,ele);
        System.out.println(res);
    }

    private static int removeElement(int[] arr,int ele) {
        int count=0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]!=ele){
              arr[count]=  arr[i];
              count++;
            }
        }
        return count;
    }
}
