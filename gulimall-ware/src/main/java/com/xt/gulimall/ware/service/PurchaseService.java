package com.xt.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xt.common.utils.PageUtils;
import com.xt.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author xt
 * @email ***
 * @date 2023-12-12 14:48:10
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

