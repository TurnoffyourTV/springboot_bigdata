package com.example.springboot_bigdata.service;

import java.util.Map;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-21:05
 */
public interface UserService {
    int save(Map<String,String> userInfo);
}

