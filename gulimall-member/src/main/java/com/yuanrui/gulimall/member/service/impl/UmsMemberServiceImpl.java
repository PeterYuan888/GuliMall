package com.yuanrui.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanrui.common.utils.PageUtils;
import com.yuanrui.common.utils.Query;

import com.yuanrui.gulimall.member.dao.UmsMemberDao;
import com.yuanrui.gulimall.member.entity.UmsMemberEntity;
import com.yuanrui.gulimall.member.service.UmsMemberService;


@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMemberEntity> implements UmsMemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberEntity> page = this.page(
                new Query<UmsMemberEntity>().getPage(params),
                new QueryWrapper<UmsMemberEntity>()
        );

        return new PageUtils(page);
    }

}