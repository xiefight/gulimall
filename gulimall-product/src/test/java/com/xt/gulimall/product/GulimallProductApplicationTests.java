package com.xt.gulimall.product;

import com.xt.gulimall.product.entity.BrandEntity;
import com.xt.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("save success");

        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为1");
        brandService.updateById(brandEntity);

    }

}
