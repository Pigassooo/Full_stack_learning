package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Testing {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("A");
        c.add("B");
        c.add("C");

        // 1. 从集合对象中获取迭代器对象
        Iterator<String> it = c.iterator();

        // 2. 将循环结合迭代器遍历集合
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        c.forEach(System.out::println);


        List<String> d = new ArrayList<>();
        d.add("A");
        d.add("B");
        d.add("C");
        d.add("D");

        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
    }
}
