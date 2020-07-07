package com.xiaoyang.mall.service;

import com.xiaoyang.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 * Created by HZ on 2020/7/7.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
