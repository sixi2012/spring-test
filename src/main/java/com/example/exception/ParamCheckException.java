package com.example.exception;

import com.example.constants.ValidationEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class ParamCheckException extends RuntimeException {
    private String retCode;
    private String retMessage;

    public String getRetCode() {
        return this.retCode;
    }
    public String getRetMessage() {
        return this.retMessage;
    }

    public ParamCheckException(ValidationEnum validationEnum) {
        this.retCode = validationEnum.getCode();
        this.retMessage = validationEnum.getMessage();
        log.info("param valid, retCode: " + this.retCode + ", retMessage: " + this.retMessage);
    }
}
