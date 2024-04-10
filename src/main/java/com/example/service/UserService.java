package com.example.service;

import com.example.domain.bo.UserBo;

public interface UserService {
    public UserBo findById(Integer id);
}
