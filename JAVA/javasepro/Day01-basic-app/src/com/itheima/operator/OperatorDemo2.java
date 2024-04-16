package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        int rs = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(rs);
    }
}
