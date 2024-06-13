package com.example.controller;

import com.example.api.UserApi;
import com.example.domain.api.UserInfo;
import com.example.domain.bo.UserBo;
import com.example.domain.vo.UserVo;
import com.example.service.RedisService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserApi userApi;

    @GetMapping("/getById")
    public UserVo getById(@RequestParam("id") int id){
        UserBo userBo = userService.findById(id);

        UserVo userVo = new UserVo();
        userVo.setId(userBo.getId());
        userVo.setName(userBo.getName());
        userVo.setAge(userBo.getAge());
        userVo.setMessage(userBo.getMessage());

        return userVo;
    }

    @GetMapping("/getByName")
    public String getByName(@RequestParam("name") String name){

        redisService.set(name, name + "_redis_test_" + System.currentTimeMillis());
        return redisService.get(name).toString();
    }

    @GetMapping("/getByAPI")
    public UserVo getUserInfo(@RequestParam("id") int id){
        UserInfo userInfo = userApi.getUserInfoByID(id);

        UserVo userVo = new UserVo();
        userVo.setId(userInfo.getId());
        userVo.setName(userInfo.getName());
        userVo.setAge(userInfo.getAge());
        userVo.setMessage(userInfo.getMessage());
        return userVo;
    }
}
