package com.xt.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xt.common.utils.PageUtils;
import com.xt.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xt
 * @email ***
 * @date 2023-12-12 14:33:25
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

