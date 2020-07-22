package com.xiaoyang.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by HZ on 2020/07/08.
 */
@Configuration
@MapperScan({"com.xiaoyang.mall.mbg.mapper","com.xiaoyang.mall.dao"})
public class MyBatisConfig {
}
