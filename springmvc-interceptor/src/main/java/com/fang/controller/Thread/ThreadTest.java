package com.fang.controller.Thread;
class myThread1 extends Thread{
    @Override
    public void run() {
        Thread t1 = new Thread(new TimeExecutors());
        t1.start();
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
class myThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest extends Thread{
    public static void main(String[] args) {
        TimeExecutors time1 = new TimeExecutors();
        Thread t1 = new Thread(time1);
        t1.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        time1.cancel();

    }
}
