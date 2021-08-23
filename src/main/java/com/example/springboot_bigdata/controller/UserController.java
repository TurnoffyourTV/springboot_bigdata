package com.example.springboot_bigdata.controller;

import com.example.springboot_bigdata.service.UserService;
import com.example.springboot_bigdata.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-21:11
 */

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("register")
    public JsonData register(@RequestBody Map<String,String> userInfo){
        int rows=userService.save(userInfo);
        if(rows==-1){
            return JsonData.buildError(-1,"注册失败，信息缺失");
        }
        if(rows==-2){
            return JsonData.buildError(-1,"注册失败，手机号已存在");
        }
        return JsonData.buildSuccess();
    }
}
