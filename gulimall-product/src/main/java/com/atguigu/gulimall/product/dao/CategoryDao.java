package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author alex
 * @email alex@gmail.com
 * @date 2025-04-14 21:44:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
