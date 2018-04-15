package com.xmh.sell.dao;

import com.xmh.sell.pojo.OrderMaster;
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
public class OrderMasterDaoTest {

    @Autowired
    private  OrderMasterDao orderMasterDao;


    private final String OPENID = "110110";

    @Test
    public void testSave(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("212321312321");
        orderMaster.setBuyerAddress("广工");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(200));

        OrderMaster orderMaster1 = orderMasterDao.save(orderMaster);

        Assert.assertNotEquals(null,orderMaster1);

    }

    @Test
    public void findByBuyerOpenid() throws Exception {

        PageRequest pageRequest = new PageRequest(0,1);

        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid(OPENID,pageRequest);
        Assert.assertNotEquals(0,result.getContent());
        System.out.println(result.getTotalElements());

    }

}