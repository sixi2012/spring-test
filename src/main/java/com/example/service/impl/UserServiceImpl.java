package com.example.service.impl;

import com.example.domain.bo.UserBo;
import com.example.domain.entity.UserEntity;
import com.example.service.UserService;
import com.example.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBo findById(Integer id) {

        UserEntity userEntity = userMapper.findById(id);

        UserBo userBo = new UserBo();
        userBo.setId(userEntity.getId());
        userBo.setName(userEntity.getName());
        userBo.setAge(userEntity.getAge());
        userBo.setMessage(userEntity.getMessage());

        return userBo;
    }
}
