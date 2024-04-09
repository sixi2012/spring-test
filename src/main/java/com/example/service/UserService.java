package com.example.service;

import com.example.bo.UserBo;
import com.example.entity.UserEntity;

public interface UserService {
    public UserBo findById(Integer id);
}
