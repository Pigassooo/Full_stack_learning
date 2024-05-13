package com.itheima.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = new String("Hello World");
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.equals("hello world"));
        System.out.println(s.equalsIgnoreCase("hello world"));
        System.out.println(s.substring(1, 5));
        System.out.println(s.substring(1));
        System.out.println(s.replace("Hello", "world"));
        System.out.println(s.contains("ll"));
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("l"));
        System.out.println(s.indexOf("l"));
        String[] reslut = s.split("ll");
        System.out.println(reslut[0]);
        System.out.println(reslut[1]);
    }
}
