package com.example.springboot_bigdata.exception;

import lombok.Data;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-20:52
 */

@Data
public class XMException extends RuntimeException {
    private Integer code;
    private String msg;

    public XMException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
