package com.xt.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xt.common.utils.PageUtils;
import com.xt.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author xt
 * @email ***
 * @date 2023-12-08 17:04:09
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

