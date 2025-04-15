package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author alex
 * @email alex@gmail.com
 * @date 2025-04-15 21:59:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
