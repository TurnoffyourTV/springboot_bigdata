package com.example.springboot_bigdata.controller;

import com.example.springboot_bigdata.domain.Video;
import com.example.springboot_bigdata.domain.VideoBanner;
import com.example.springboot_bigdata.service.VideoService;
import com.example.springboot_bigdata.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TurnoffyourTV
 * @create 2021-08-12-11:35
 */

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("list")
    public Object videoList(){
        List<Video> videoList=videoService.listVideo();
        return JsonData.buildSuccess(videoList);
    }
    @GetMapping("list_banner")
    public JsonData indexBanner(){
        List<VideoBanner> videoBannerList=videoService.listBanner();
        return JsonData.buildSuccess(videoBannerList);
    }

    //RequestParam请求参数，前端传过来的值name为video_id，必须传递，后端接收的参数名为videoId
    @GetMapping("find_detail_by_id")
    public JsonData findDetailById(@RequestParam(value = "video_id",required= true)int videoId){
        Video video=videoService.findDetailById(videoId);
        return JsonData.buildSuccess(video);
    }

}

