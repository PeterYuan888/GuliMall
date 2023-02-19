package com.yuanrui.gulimall.product.dao;

import com.yuanrui.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuanrui
 * @email 844503622@qq.com
 * @date 2023-02-19 22:13:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
