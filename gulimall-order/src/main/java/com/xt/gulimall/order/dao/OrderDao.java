package com.xt.gulimall.order.dao;

import com.xt.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xt
 * @email ***
 * @date 2023-12-08 17:04:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
