package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:18
 */

@Data
public class Video {
    private Integer id;

    private String title;

    private String summary;

    private String coverImg;

    private Integer  price;

    private Date createTime;

    private Double point;

    private List<Chapter> chapterList;
}
