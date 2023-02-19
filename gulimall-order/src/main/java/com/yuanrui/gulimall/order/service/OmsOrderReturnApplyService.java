package com.yuanrui.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.gulimall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-20 00:29:50
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

