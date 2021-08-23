package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:16
 */

@Data
public class Episode {
    private Integer id;

    private String title;

    private Integer num;

    private Integer ordered;

    private String playUrl;

    private Integer chapterId;

    private Integer free;

    private Integer videoId;

    private Date createTime;
}

