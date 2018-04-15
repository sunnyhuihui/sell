package com.xmh.sell.enums;

import lombok.Getter;

/**
 * @author Ming
 * @create 2018-04-08 下午6:14
 * 商品状态
 **/
@Getter
public enum ProductStatusEnum {

    UP(0,"商品上架"),
    DOWN(1,"商品下架"),

    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    ProductStatusEnum() {
    }
}
