package com.atguigu.test;

import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDaoImpl userDao = new UserDaoImpl();
    @Test
    public void queryUserByUserName() {
        System.out.println(userDao.queryUserByUserName("admin"));
    }

    @Test
    public void queryUserByUserNameAndPassword(){
        System.out.println(userDao.queryUserByUserNameAndPassword("admin","admin"));
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"admin6","123456","admin1@qq.com")));
    }
}