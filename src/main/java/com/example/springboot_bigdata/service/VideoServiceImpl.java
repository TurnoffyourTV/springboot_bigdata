package com.example.springboot_bigdata.service;

import com.example.springboot_bigdata.domain.Video;
import com.example.springboot_bigdata.domain.VideoBanner;
import com.example.springboot_bigdata.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-11:35
 */

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }

    @Override
    public List<VideoBanner> listBanner() {
        return videoMapper.listBanner();
    }

    @Override
    public Video findDetailById(int videoId) {
        return videoMapper.findDetailById(videoId);
    }


}
