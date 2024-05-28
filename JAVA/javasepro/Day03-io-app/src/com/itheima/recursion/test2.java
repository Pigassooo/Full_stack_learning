package com.itheima.recursion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class test2 {
    public static void main(String[] args) {
        try(
                Reader fr = new FileReader("E:\\code\\Full_stack_learning\\JAVA\\javasepro\\Day03-io-app\\src\\com\\itheima\\recursion\\123");
                ){
//            char[] buf = new char[3];
//            int len;
//            while((len=fr.read(buf))!= -1 ){
//                System.out.print(new String(buf,0,len));
            int c;
            while((c =fr.read())!=-1){
                System.out.print((char)c);

        }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
