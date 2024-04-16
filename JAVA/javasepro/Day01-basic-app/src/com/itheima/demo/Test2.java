package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30 ,40 ,50};

        for (int i = 0, j= array.length -1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
