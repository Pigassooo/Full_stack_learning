package com.itheima;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


// 1. 让这个类实现Callable接口
public class MyCallable implements Callable<String>{

    private int n;
    public MyCallable(int n) {
        this.n = n;
    }


    // 2. 重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程求出的1-"+n+"的和是："+sum;
    }
}
