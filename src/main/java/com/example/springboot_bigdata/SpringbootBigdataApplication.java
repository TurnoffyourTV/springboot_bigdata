package com.example.springboot_bigdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_bigdata.mapper")
public class SpringbootBigdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBigdataApplication.class, args);
    }

}
