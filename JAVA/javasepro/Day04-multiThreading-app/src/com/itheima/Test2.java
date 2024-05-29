package com.itheima;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) {

//        public ThreadPoolExecutor(int corePoolSize,
//                                int maximumPoolSize,
//                                long keepAliveTime,
//                                TimeUnit unit,
//                                BlockingQueue<Runnable> workQueue,
//                                ThreadFactory threadFactory,
//                                RejectedExecutionHandler handler) {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        MyRunnable myRunnable = new MyRunnable();
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
        poolExecutor.execute(myRunnable);
    }
}
