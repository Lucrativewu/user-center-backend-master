package com.wupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupi.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author wujianhang
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-04-01 00:06:47
*/
public interface UserService extends IService<User> {

    /**
     *  用户注册
     * @param userAccount 用户名
     * @param userPassword  用户密码
     * @param checkPassword  校验密码
     * @param planetCode    星球编号
     * @return 用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);

    /**用户登录
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request
     * @return 用户信息
     */

    User userLogin(String userAccount, String userPassword,HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
