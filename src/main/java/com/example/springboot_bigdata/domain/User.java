package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:17
 */

@Data
public class User {
    private Integer id;

    private String name;

    private String pwd;

    private String headImg;

    private String phone;

    private Date createTime;

    private int money;
}
