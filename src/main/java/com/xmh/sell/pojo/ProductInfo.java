package com.xmh.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Ming
 * @create 2018-04-08 下午5:22
 **/
@Entity
@Data
public class ProductInfo {

    /** 商品id */
    @Id
    private String productId;

    /** 商品名字 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;
    
    /** 商品库存 */
    private Integer productStock;
    
    /** 商品描述 */
    private String productDesc;
    
    /** 商品缩略图 */
    private String productIcon;
    
    /** 商品类别 */
    private Integer categoryType;
    
    /** 商品状态 0表示正常 1表示下架 */
    private Integer productStatus;
    
}
