package com.example.springboot_bigdata.utils;

import lombok.Data;

/**
 * @author TurnoffyourTV
 * @create 2021-08-16-20:13
 */

@Data
public class JsonData {
    /**
     * 状态码 0表示成功过，1表示处理中，-1 表示失败
     */
    private Integer code;
    /**
     * 业务数据
     */
    private Object data;
    /**
     * 信息表示
     */
    private String msg;

    public JsonData() {
    }

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功，不用返回数据
     */
    public static JsonData buildSuccess() {
        return new JsonData(0, null, null);
    }

    /**
     * 成功，返回数据
     */
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, data, null);
    }

    /**
     * 失败，固定状态码
     */
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }

    /**
     * 失败，自定义错误码和信息
     */
    public static JsonData buildError(Integer code, String msg) {
        return new JsonData(code, null, msg);
    }
}
