package com.example.controller;

import com.example.Service.RedisService;
import com.example.Service.UserService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/getMsg")
    public String getMsg(@Param("id") String id){
//        User user = userService.findById(id);
//        return user.getMessage();

        redisService.set(id, id + "_redis_test_" + System.currentTimeMillis());
        return redisService.get(id).toString();
    }
}
