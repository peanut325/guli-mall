package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author peanut
 * @email peanut@gmail.com
 * @date 2022-04-20 11:34:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
