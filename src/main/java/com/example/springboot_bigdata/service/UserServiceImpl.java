package com.example.springboot_bigdata.service;

import com.example.springboot_bigdata.domain.User;
import com.example.springboot_bigdata.mapper.UserMapper;
import com.example.springboot_bigdata.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-21:06
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int save(Map<String,String> userInfo) {
        User user=parseToUser(userInfo);
        if(user==null){
            //信息不全
            return -1;
        }
        if(userMapper.findByPhone(user.getPhone())!=null){
            //手机号重复
            return -2;
        }
        //成功则返回1，生效行数
        return userMapper.save(user);
    }
    //前端传来的数据转换成user
    private User parseToUser(Map<String, String> userInfo) {
        if(userInfo.containsKey("phone")&&userInfo.containsKey("pwd")&&userInfo.containsKey("name")){
            User user=new User();
            user.setName(userInfo.get("name"));
            user.setHeadImg(getRandomImg());
            user.setPhone(userInfo.get("phone"));
            user.setCreateTime(new Date());
            String pwd=userInfo.get("pwd");
            //MD5加密
            user.setPwd(CommonUtils.MD5(pwd));
            return user;
        }else {
            return null;
        }
    }

    /**
     * 放在CDN上的随机头像
     */
    private static final String [] headImg = {
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };

    private String getRandomImg(){
        int size =  headImg.length;
        Random random = new Random();
        int index = random.nextInt(size);
        return headImg[index];
    }
}
