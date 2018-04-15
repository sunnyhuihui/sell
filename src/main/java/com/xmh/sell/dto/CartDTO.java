package com.xmh.sell.dto;

import lombok.Data;

/**
 * @author Ming
 * @create 2018-04-14 下午2:37
 **/
@Data
public class CartDTO {

    /** 商品ID */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}
