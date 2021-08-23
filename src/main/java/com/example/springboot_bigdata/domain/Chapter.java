package com.example.springboot_bigdata.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:15
 */

@Data
public class Chapter {
    private Integer id;

    private Integer videoId;

    private String title;

    private Integer ordered;

    private Date createTime;

    private List<Episode> episodeList;

}
