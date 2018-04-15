package com.xmh.sell.dao;

import com.xmh.sell.pojo.ProductInfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setCategoryType(2);
        productInfo.setProductDesc("很好喝");
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("www.xxx.icon");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);

        productInfoDao.save(productInfo);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfo = productInfoDao.findByProductStatus(0);
        System.out.println(productInfo.get(0).toString());
    }

}