package com.itheima.recursion;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws Exception {
        search(new File("D:\\"),"QQMusic.exe");
    }

    /**
     * 去目录下搜索某个文件
     * @param dir 目录
     * @param fileName 文件名
     */
    public static void search(File dir, String fileName) throws Exception {
        // 1. 把非法情况拦截住
        if(dir == null || !dir.exists() || !dir.isDirectory()){
            return;
        }

        // 2. 获取当前目录下的全部一级文件对象
        File[] files = dir.listFiles();

        // 3. 判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if(files != null && files.length > 0){
            for(File file : files){
                if(file.isFile()){
                    if(fileName.equals(file.getName())){
                        System.out.println(file.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                    }
                }
                else if(file.isDirectory()){
                    search(file, fileName);
                }
            }
        }
    }
}
