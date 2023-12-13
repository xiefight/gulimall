package com.xt.gulimall.product.dao;

import com.xt.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xt
 * @email xiefight@foxmail.com
 * @date 2023-12-07 10:47:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
