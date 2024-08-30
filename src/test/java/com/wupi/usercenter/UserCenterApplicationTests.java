package com.wupi.usercenter;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wupi.usercenter.model.domain.User;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;

import static com.sun.javafx.font.FontResource.SALT;

@SpringBootTest
class UserCenterApplicationTests {


    @SneakyThrows
    @Test
    void testDigest() {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String encryptPassword = DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
        System.out.println(encryptPassword);
    }

    @Test
    void contextLoads() {
    }

}
