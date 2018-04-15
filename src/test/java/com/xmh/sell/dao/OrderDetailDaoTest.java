package com.xmh.sell.dao;

import com.xmh.sell.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {


    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void findByOrderId() throws Exception {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("111111111");
        orderDetail.setProductIcon("www.xie.com");
        orderDetail.setProductId("111");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(5));
        orderDetail.setProductQuantity(3);


        OrderDetail orderDetail1 = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(orderDetail1);
    }



}