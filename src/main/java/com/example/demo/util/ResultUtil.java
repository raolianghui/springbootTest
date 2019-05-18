package com.example.demo.util;

import com.example.demo.VO.ResultVO;
import com.example.demo.enums.ResultEnums;

/**
 * Created by T009538 on 2019/5/18.
 */
public class ResultUtil {
    public  static ResultVO success(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setError_code(0);
        resultVO.setMsg("success");
        resultVO.setData(data);
        return resultVO;
    }
    public  static ResultVO fail(ResultEnums resultEnums){
        ResultVO resultVO=new ResultVO();
        resultVO.setError_code(resultEnums.getCode());
        resultVO.setMsg(resultEnums.getMsg());
        resultVO.setData(null);
        return resultVO;
    }
}
