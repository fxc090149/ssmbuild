package com.fang.controller;
class window implements Runnable{
    private int tickets = 100;
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } `
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

class Singleton{
    private static volatile Singleton singleton= null;
    private Singleton(){}
    public static Singleton getSingleton(){
        if(null == singleton){
            synchronized(Singleton.class){
                if(null == singleton){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
public class windowsTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        window win = new window();

        Thread win1 = new Thread(win);
        Thread win2 = new Thread(win);
        Thread win3 = new Thread(win);
        win1.setName("窗口1");
        win2.setName("窗口2");
        win3.setName("窗口3");
        win1.start();
        win2.start();
        win3.start();
    }


}
