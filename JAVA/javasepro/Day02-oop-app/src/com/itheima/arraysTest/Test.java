package com.itheima.arraysTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr2, 2);
        System.out.println(Arrays.toString(arr3));

        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return arr[operand] * 3;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
