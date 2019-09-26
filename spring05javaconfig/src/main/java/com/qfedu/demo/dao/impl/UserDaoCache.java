package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;

public class UserDaoCache implements UserDao {
    public void add() {
        System.out.println("添加用户到缓存中...");
    }
}
