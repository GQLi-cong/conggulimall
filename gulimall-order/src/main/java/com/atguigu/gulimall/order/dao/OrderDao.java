package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author alex
 * @email alex@gmail.com
 * @date 2025-04-15 22:26:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
