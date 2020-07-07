package com.xiaoyang.mall.common.api;

/**
 * 封装API的错误码
 * Created by HZ on 2020/07/07.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}