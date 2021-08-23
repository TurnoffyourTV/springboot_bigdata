package com.example.springboot_bigdata.mapper;

import com.example.springboot_bigdata.domain.Video;
import com.example.springboot_bigdata.domain.VideoBanner;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-10:59
 */

@Repository
public interface VideoMapper {

    /**
     * 查询视频列表
     * @return
     */
    List<Video> listVideo();


    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}

