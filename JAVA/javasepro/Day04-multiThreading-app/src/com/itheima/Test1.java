package com.itheima;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) throws Exception {

        // 3. 创建一个Callable对象
        Callable<String> mycallable = new MyCallable(100);

        // 4. 把Callable的对象封装成一个FutureTask对象（任务对象）
        FutureTask<String> f1 = new FutureTask<>(mycallable);
        // 5. 把任务对象交给一个Thread对象
        new Thread(f1).start();

        // 6. 获取线程执行完毕后返回的结果
        // 注意：如果执行到这，假如上面的代码还没有执行完毕，这里的代码会暂停，等待上面线程执行完毕后，才会获取结果
        String s = f1.get();
        System.out.println(s);

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    }
}