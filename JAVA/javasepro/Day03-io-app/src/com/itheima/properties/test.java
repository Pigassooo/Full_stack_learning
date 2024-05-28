package com.itheima.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("a","b");
        properties.setProperty("c","d");
        properties.store(new FileOutputStream("./test.properties"), "test");
    }
}
