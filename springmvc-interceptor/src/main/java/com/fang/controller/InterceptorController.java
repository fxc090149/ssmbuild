package com.fang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//测试拦截器的控制器
@RestController
public class InterceptorController {

    @RequestMapping("/interceptor")
    @ResponseBody
    public String testFunction() {
        System.out.println("控制器中的方法执行了");
        return "hello";
    }
}