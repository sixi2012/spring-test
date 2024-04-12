package com.example.api.impl;

import com.example.api.UserApi;
import com.example.domain.api.UserInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserApiImpl implements UserApi {
    @Resource
    private RestTemplate restTemplate;

    @Override
    public UserInfo getUserInfoByID(Integer id) {
        String url = "http://localhost:8888/user/getById?id={?}";

        return restTemplate.getForObject(url, UserInfo.class, id);
    }
}
