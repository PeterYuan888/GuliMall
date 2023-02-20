package com.yuanrui.gulimall.ware.feign;


import com.yuanrui.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("gulimall-product")
public interface productFeign {
    @RequestMapping("/product/brand/list")
    public R list(@RequestParam Map<String, Object> params);
}
