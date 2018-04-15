package com.xmh.sell.pojo;

import com.xmh.sell.enums.OrderStatusEnum;
import com.xmh.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Ming
 * @create 2018-04-14 上午10:48
 **/
@Entity
@Data
@DynamicUpdate //更新的时候自动更新时间
public class OrderMaster {


    /** 订单id */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态默认为0 未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;


}
