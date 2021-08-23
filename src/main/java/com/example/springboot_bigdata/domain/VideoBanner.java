package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:19
 */

@Data
public class VideoBanner {
    private Integer id;

    private String url;

    private String img;

    private Date createTime;

    private Integer weight;
}
