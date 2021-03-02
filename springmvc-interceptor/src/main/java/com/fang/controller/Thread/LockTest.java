package com.fang.controller.Thread;

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable{
    private int tickets = 100;

    private ReentrantLock lock = new ReentrantLock();
    public void run() {
        while(true){
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "：售票，票号为" + tickets);
                    tickets--;
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }


}
