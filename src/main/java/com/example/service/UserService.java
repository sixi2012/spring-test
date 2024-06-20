package com.example.service;

import com.example.domain.bo.UserBo;

public interface UserService {
    UserBo findById(Integer id);

    int savaUserInfo(UserBo userBo);
}
