package com.example.controller;

import com.example.bo.UserBo;
import com.example.service.RedisService;
import com.example.service.UserService;
import com.example.vo.UserVo;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/getById")
    public UserVo getById(@Param("id") int id){
        UserBo userBo = userService.findById(id);

        UserVo userVo = new UserVo();
        userVo.setId(userBo.getId());
        userVo.setName(userBo.getName());
        return userVo;
    }

    @GetMapping("/getCache")
    public String getByName(@Param("name") String name){

        redisService.set(name, name + "_redis_test_" + System.currentTimeMillis());
        return redisService.get(name).toString();
    }

    @PostMapping("/getAll")
    public List<UserVo> getAll(@RequestBody UserVo userVo){

        UserVo uv = new UserVo();
        uv.setId(userVo.getId());
        uv.setAge(111);
        uv.setName(userVo.getName());

        List<UserVo> rsp = new ArrayList<>();
        rsp.add(uv);
        return rsp;
    }
}
