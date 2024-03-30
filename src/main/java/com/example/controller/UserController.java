package com.example.controller;

import com.example.Service.UserService;
import com.example.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getMsg")
    public String getMsg(@Param("id") Integer id){
        User user = userService.findById(id);
        return user.getMessage();
    }

}
