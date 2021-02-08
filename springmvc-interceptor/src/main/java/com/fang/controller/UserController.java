package com.fang.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/jumplogin")
    public String jumpLogin() throws Exception{
        return "login";
    }

    @RequestMapping("/jumpSuccess")
    public String jumpSuccess() throws Exception{
        return "success";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @Param("userName") String userName, String pwd) throws Exception{
        System.out.println("用户名称为==========" + userName);
        session.setAttribute("user",userName);
        return "success";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception{
        session.invalidate();
        return "login";

    }
}
