package com.itheima;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 任务是干啥的
        System.out.println(Thread.currentThread().getName()+"--> 666");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
