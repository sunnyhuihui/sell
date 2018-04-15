package com.xmh.sell.service.impl;

import com.xmh.sell.dto.OrderDTO;
import com.xmh.sell.enums.OrderStatusEnum;
import com.xmh.sell.enums.PayStatusEnum;
import com.xmh.sell.pojo.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    private final String OPENID = "110110";


    private final String ORDER_ID= "db08d62952534ca094650d457fec845a";
    @Autowired
    private  OrderServiceImpl orderService;

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("谢明辉");
        orderDTO.setBuyerAddress("广工");
        orderDTO.setBuyerPhone("110110111");
        orderDTO.setBuyerOpenid(OPENID);


        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail o1 = new OrderDetail() ;
        o1.setProductId("1234567");
        o1.setProductQuantity(10);
        orderDetailList.add(o1);



        OrderDetail o2 = new OrderDetail() ;
        o2.setProductId("1234567");
        o2.setProductQuantity(10);
        orderDetailList.add(o2);






        orderDTO.setOrderDetailList(orderDetailList);


        OrderDTO result = orderService.create(orderDTO);

        log.info("[创建订单]result={}",result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);

        log.info("[查询单个订单]result={}",orderDTO);

    }

    @Test
    public void findList() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<OrderDTO> orderDTOPage = orderService.findList(OPENID,request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result.getOrderStatus());

    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStatus());

    }

}