package com.wupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserLoginRequest implements Serializable {

    public static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

}
