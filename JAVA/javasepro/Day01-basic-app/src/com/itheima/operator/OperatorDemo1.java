package com.itheima.operator;


import java.sql.SQLOutput;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        int c = 5;
        System.out.println("abc" + c); // abc5
        System.out.println(c + 5); // 10
        System.out.println("itheima" + c +'a');
        System.out.println(c + 'a' + "itheima");
    }
}
