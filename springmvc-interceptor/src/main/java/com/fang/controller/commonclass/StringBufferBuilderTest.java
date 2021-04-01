package com.fang.controller.commonclass;

import org.junit.Test;

public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }

    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("HelloWorld");
        sb1.append(1);
        System.out.println(sb1);
        sb1.delete(2, 4);
        System.out.println(sb1);
        sb1.replace(3, 3, "qsdq");
        System.out.println(sb1);
        sb1.insert(5, "dog");
        System.out.println(sb1);
    }

    @Test
    public void test3() {
        long startTime;
        long endTime;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间：" + (endTime - startTime));
    }

    public int getCount(String mainStr, String subStr){
        return 0;
    }

}