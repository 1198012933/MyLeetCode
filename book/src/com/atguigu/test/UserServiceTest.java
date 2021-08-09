package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(null,"admin7","123456","admin@qq.com"));
        userService.registerUser(new User(null,"admin8","123456","admin@qq.com"));
        userService.registerUser(new User(null,"admin9","123456","admin@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"admin7","123456","admin@qq.com")));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("admin11")){
            System.out.println("已存在");
        }else {
            System.out.println("可注册");
        }
    }
}