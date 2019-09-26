package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.dao.impl.UserDaoCache;
import com.qfedu.demo.dao.impl.UserDaoNormal;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public UserDao userDaoNormal() {
        System.out.println("创建UserDao对象");
        return new UserDaoNormal();
    }

    @Bean
    @Primary
    public UserDao userDaoNoCache() {
        System.out.println("创建UserDaoCache对象");
        return new UserDaoCache();
    }

    @Bean
    public UserService userServiceNormal(UserDao userDao) {
        System.out.println("创建UserService对象");
//        return new UserServiceNormal(userDao);
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }
}
