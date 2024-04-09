package com.example.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {
    private static final long serialVersionUID = 429425014454194277L;

    private Integer id;
    private String name;
    private Integer age;
    private String desc;
}
