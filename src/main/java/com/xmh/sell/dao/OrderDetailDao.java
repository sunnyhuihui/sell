package com.xmh.sell.dao;

import com.xmh.sell.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ming
 * @create 2018-04-14 上午11:32
 **/
public interface OrderDetailDao extends JpaRepository<OrderDetail,String>{

    List<OrderDetail> findByOrderId(String orderId);

}
