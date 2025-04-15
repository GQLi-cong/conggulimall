package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author alex
 * @email alex@gmail.com
 * @date 2025-04-15 22:12:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
