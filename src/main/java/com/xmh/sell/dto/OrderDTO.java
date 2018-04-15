package com.xmh.sell.dto;

import com.xmh.sell.enums.OrderStatusEnum;
import com.xmh.sell.enums.PayStatusEnum;
import com.xmh.sell.pojo.OrderDetail;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Ming
 * @create 2018-04-14 下午1:47
 **/
@Data
public class OrderDTO {
    /** 订单id */
    private String orderId;

    /** 买家 */
    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    /** 微信openid */
    private String buyerOpenid;

    /** 订单总价 */
    private BigDecimal orderAmount;

    /** 订单状态  默认未新订单 */
    private Integer orderStatus;

    /** 支付状态默认为0 未支付*/
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
