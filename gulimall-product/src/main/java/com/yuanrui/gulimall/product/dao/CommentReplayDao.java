package com.yuanrui.gulimall.product.dao;

import com.yuanrui.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-19 22:13:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
