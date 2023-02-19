package com.yuanrui.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.gulimall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-20 00:33:05
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

