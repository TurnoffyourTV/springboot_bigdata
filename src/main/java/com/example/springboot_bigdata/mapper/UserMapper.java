package com.example.springboot_bigdata.mapper;

import com.example.springboot_bigdata.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-21:04
 */
@Repository
public interface UserMapper {
    //@Param用作参数的对应，多参数使用，这里可加可不加

    User findByPhone(@Param("phone") String phone);

    int save(User user);
}

