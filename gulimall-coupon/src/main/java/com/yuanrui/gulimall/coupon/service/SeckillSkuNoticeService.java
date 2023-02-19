package com.yuanrui.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-20 00:20:24
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

