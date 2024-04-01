package com.example.Service;

public interface RedisService {
    /**
     * 保存属性
     */
    void set(String key, Object value);

    /**
     * 获取属性
     */
    Object get(String key);

    /**
     * 删除属性
     */
    Boolean del(String key);

    /**
     * 判断是否有该属性
     */
    Boolean hasKey(String key);
}
