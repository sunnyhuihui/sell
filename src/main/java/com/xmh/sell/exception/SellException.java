package com.xmh.sell.exception;

import com.xmh.sell.enums.ResultEnum;

/**
 * @author Ming
 * @create 2018-04-14 下午2:09
 **/
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage()); //把消息传到父类
        this.code = resultEnum.getCode();
    }


    public SellException(Integer code, String message) {
        super(message); //把消息传到父类
        this.code = code;
    }

    public SellException() {
    }
}
