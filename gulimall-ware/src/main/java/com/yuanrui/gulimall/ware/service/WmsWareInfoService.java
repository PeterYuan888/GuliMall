package com.yuanrui.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.gulimall.ware.entity.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-20 00:33:05
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

