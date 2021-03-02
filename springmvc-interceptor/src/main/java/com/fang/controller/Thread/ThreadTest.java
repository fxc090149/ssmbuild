package com.fang.controller.Thread;
class myThread1 extends Thread{
    @Override
    public void run() {
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
//        myThread t1 = 
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
//        for (int i = 0; i < 100; i++) {
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }
    }
}
