package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (userService.login(new User(null,username,password,null))==null){
            System.out.println("用户不存在！");
            req.getRequestDispatcher("/pages/user/login.html").forward(req,resp);
        }else {
            System.out.println("登入成功！");
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req,resp);
        }

    }
}
