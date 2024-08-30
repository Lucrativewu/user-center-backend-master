package com.wupi.usercenter.service;

import com.wupi.usercenter.ErrorCode.ErrorCode;
import com.wupi.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author wupi
 *
 */

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    void testAddUser(){
        User user=new User();
        user.setUsername("xiaowupi");
        user.setUserAccount("123");
        user.setAvatarUrl("https://img2.baidu.com/it/u=3618236253,1028428296&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1680368400&t=d74428032eb54f79ced25884b38f5b32");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("566");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }


    @Test
    void userRegister() {
        String userAccount="wupi";
        String userPassword="";
        String checkPassword="123456";
        String planetCode="1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        userAccount="wu";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        userAccount="wupi";
        userPassword="123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        userAccount="wu pi";
        userPassword="12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        checkPassword="123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        userAccount="xiaowupi";
        checkPassword="12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);

        userAccount="wupi";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
    }
}