package com.fang.controller.commonclass;

import org.junit.Test;

import java.util.Arrays;

public class CompareTest {
    @Test
    public  void test1(){
        String[] arr =  new String[]{"AA","JJ","DD","KK","HH"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
