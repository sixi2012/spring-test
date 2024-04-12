package com.example.api;

import com.example.domain.api.UserInfo;

public interface UserApi {
    UserInfo getUserInfoByID(Integer id);
}