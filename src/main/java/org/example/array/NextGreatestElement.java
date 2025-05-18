package org.example.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 3, 5, 4, 8, 7, 6, 2, 9};
        result(arr);
    }

    private static void result(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[nge.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));

    }
}
