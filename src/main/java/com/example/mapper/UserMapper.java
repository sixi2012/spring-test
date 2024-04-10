package com.example.mapper;

import com.example.domain.bo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public UserEntity findById(Integer id);
}
