package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFestival implements UserService {
    public void add() {
        System.out.println("注册用户并发送优惠券");
    }
}
