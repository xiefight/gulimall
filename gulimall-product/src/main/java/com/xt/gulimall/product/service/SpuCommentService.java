package com.xt.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xt.common.utils.PageUtils;
import com.xt.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author xt
 * @email xiefight@foxmail.com
 * @date 2023-12-07 10:47:23
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

