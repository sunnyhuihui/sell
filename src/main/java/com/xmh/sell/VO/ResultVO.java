package com.xmh.sell.VO;

import lombok.Data;

/**
 * @author Ming
 * @create 2018-04-08 下午11:31
 **/
@Data
public class ResultVO<T> {

    /** 状态码 */
    private Integer code;

    /** 状态信息 */
    private String msg;

    /** 数据 */
    private T data;
}
