package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

public interface Userservice {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
