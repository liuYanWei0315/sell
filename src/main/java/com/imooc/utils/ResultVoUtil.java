package com.imooc.utils;

import com.imooc.vo.ResultVo;

/**
 * @author liuyw
 * @date 2018/5/23 17:17
 */
public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setData(object);
        resultVo.setMsg("成功");
        return  resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo error(Integer code, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
