package com.fang.controller.Thread;

/**
 * 线程通信：生产者/消费者问题
 */
class Clerk{
    private int product = 0;
    public synchronized void produceProduce() {
        if(product < 20){
            product++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + product + "产品");
            notify();
        }else{
            System.out.println("仓库满了，放不下了！");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
        if(product > 0){
            System.out.println(Thread.currentThread().getName()
                    + "开始消费了第"+product+"个产品");
        product--;
        notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费了");
        while (true){
            try {
                Thread.sleep((int)Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产了");
        while (true){

            try {
                Thread.sleep((int)Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduce();
        }
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread producer = new Thread(new Producer(clerk));
        Thread consumer = new Thread(new Consumer(clerk));
        producer.setName("生产者");
        consumer.setName("消费者");
        producer.start();
        consumer.start();

    }
}
