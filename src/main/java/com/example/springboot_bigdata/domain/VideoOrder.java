package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:20
 */

@Data
public class VideoOrder {
    private Integer id;

    private String outTradeNo;

    private Integer state;

    private Date createTime;

    private  Integer totalFee;

    private Integer videoId;

    private String videoTitle;

    private String videoImg;

    private Integer userId;
}
