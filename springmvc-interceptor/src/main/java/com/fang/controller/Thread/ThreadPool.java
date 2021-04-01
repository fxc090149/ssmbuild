package com.fang.controller.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 创建线程的方式：线程池
* */
class NumberThread implements Runnable{
    @Override
    public void run(){
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() +
                        "++++++"+ i);
                sum += i;
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run(){
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() +
                        "++++++"+ i);
                sum += i;
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new NumberThread());
//        executorService.submit();
        executorService.execute(new NumberThread1());
        executorService.shutdown();
    }
}
