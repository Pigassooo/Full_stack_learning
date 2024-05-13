package com.itheima.arryList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add('a');
        System.out.println(list);
        list.add(0,'b');
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list);
        list.add("cad");
        System.out.println(list.remove("a"));
        System.out.println(list);
        System.out.println(list.remove("cad"));
        System.out.println(list);
        System.out.println(list.set(0,"abc"));
        System.out.println(list);
    }
}
