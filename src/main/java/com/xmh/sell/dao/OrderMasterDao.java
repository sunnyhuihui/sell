package com.xmh.sell.dao;

import com.xmh.sell.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ming
 * @create 2018-04-14 上午11:22
 **/
public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {

    /** 按照买家id买查处订单  并且分页 */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
