package com.qfedu.demo.service;

import com.qfedu.demo.service.impl.UserServiceNormal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {
   @Resource(name="userServiceNormal")
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }
}
