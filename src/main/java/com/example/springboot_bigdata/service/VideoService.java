package com.example.springboot_bigdata.service;

import com.example.springboot_bigdata.domain.Video;
import com.example.springboot_bigdata.domain.VideoBanner;

import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-11:34
 */

public interface VideoService {
    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
