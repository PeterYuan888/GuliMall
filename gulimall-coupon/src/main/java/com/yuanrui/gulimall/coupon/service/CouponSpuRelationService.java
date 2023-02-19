package com.yuanrui.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-20 00:20:24
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

