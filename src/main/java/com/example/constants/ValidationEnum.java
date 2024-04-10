package com.example.constants;

import lombok.Data;

public enum ValidationEnum {
    PARAM_IS_NOT_NULL("A3R001","参数不允许为空");

    private String code;
    private String message;
    ValidationEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
