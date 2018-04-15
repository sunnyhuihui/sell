package com.xmh.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Ming
 * @create 2018-04-14 下午11:44
 **/
@Data
public class OrderForm {

    /** 买家姓名 */
    @NotEmpty(message = "姓名必填")
    private String name;

    /** 买家手机号 */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /** 买家地址 */
    @NotEmpty(message = "地址必填")
    private String address;

    /** 买家微信openid */
    @NotEmpty(message = "姓名必填")
    private String openid;

    /** 购物车信息 */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
