package org.example.array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int[]arr={9,9,9};
        plusOneResult(arr);
    }

    private static void plusOneResult(int[] arr) {
        String sum="";
        for (int i=0;i<=arr.length-1;i++){
             sum+=arr[i];
        }
        System.out.println(Integer.parseInt(sum) +1);
    }
}
