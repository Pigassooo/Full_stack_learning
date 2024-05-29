package com.itheima;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class test1 {
    public static void main(String[] args) throws Exception {

        // 3. 创建一个Callable对象
        Callable<String> mycallable = new Mycallable(100);

        // 4. 把Callable的对象封装成一个FutureTask对象（任务对象）
        FutureTask<String> f1 = new FutureTask<>(mycallable);
        // 5. 把任务对象交给一个Thread对象
        new Thread(f1).start();

        // 6. 获取线程执行完毕后返回的结果
        // 注意：如果执行到这，假如上面的代码还没有执行完毕，这里的代码会暂停，等待上面线程执行完毕后，才会获取结果
        String s = f1.get();
        System.out.println(s);
    }

    // 1. 让这个类实现Callable接口
    public static class Mycallable implements Callable<String>{

        private int n;
        public Mycallable(int n) {
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
}
