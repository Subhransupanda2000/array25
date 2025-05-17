package org.example.array;


import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedAray {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,4,4,4,4,5,5,6,7,8,9,9,9,9,9,9,9};
        removeElement(arr);
    }

    private static void removeElement(int[] arr) {
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<=arr.length-1;i++){
            hashSet.add(arr[i]);
        }
        int[]arr2=new int[hashSet.size()];
        int count=0;
        for (Integer i:hashSet){
            arr2[count]=(int)i;
            count++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
