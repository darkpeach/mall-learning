package com.xiaoyang.mall.service;
import com.xiaoyang.mall.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by HZ on 2020/07/08.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}