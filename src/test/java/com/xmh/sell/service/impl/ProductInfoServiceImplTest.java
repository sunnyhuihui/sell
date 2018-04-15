package com.xmh.sell.service.impl;

import com.xmh.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        Assert.assertNotEquals(0,productInfoService.findUpAll());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfos = productInfoService.findAll(request);
        System.out.println(productInfos.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234567");
        productInfo.setCategoryType(2);
        productInfo.setProductDesc("很好喝");
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("www.xxx.icon");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);

        productInfoService.save(productInfo);

        ProductInfo productInfo1 = productInfoService.findOne("1234567");
        productInfo1.setProductStatus(1);

        assertNotEquals(0,(int)productInfo1.getProductStatus());

    }

}