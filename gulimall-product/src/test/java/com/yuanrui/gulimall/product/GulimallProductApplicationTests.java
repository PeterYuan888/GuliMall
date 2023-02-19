package com.yuanrui.gulimall.product;

import com.yuanrui.gulimall.product.entity.BrandEntity;
import com.yuanrui.gulimall.product.service.BrandService;
import com.yuanrui.gulimall.product.service.impl.BrandServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService service =new BrandServiceImpl();
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        service.save(brandEntity);
        System.out.println("插入成功");
    }

}
