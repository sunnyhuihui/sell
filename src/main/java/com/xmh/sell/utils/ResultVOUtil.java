package com.xmh.sell.utils;

import com.xmh.sell.VO.ResultVO;

/**
 * @author Ming
 * @create 2018-04-14 上午10:35
 **/
public class ResultVOUtil {

    /** 成功时候 */
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }


    /** 成功时候 */
    public static ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    /** 失败时候 */
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
