package com.fang.controller.commonclass;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
    }

    /**
     * String:字符串 使用""表示
     * 1.String声明为final的，不可被继承
     * 2.String实现了Serializable接口：表示字符串支持串行化。
     *          实现了Comparable接口：表示String可比较
     * 3.String内部定义final char[] value用于存储字符串数据
     * 4.String:代表不可变的字符序列。
     */
    @Test
    public void test1(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        return;
    }
    @Test
    public void test3() throws UnsupportedEncodingException {
        String s1 = "java中国";
        System.out.println(Arrays.toString(s1.getBytes("utf-8")));
        System.out.println(Arrays.toString(s1.getBytes("GBK")));
        System.out.println(Arrays.toString(s1.getBytes("ISO-8859-1")));
        String s2 = s1 + "java";
        char[] arr = new char[]{'h','e'};
        String s3 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println("  ".length());
        System.out.println(s2.endsWith("ava"));
        s2.toCharArray();
        new String();
        return;
    }
}
