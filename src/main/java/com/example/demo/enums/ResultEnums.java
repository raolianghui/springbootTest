package com.example.demo.enums;

/**
 * Created by T009538 on 2019/5/18.
 */
public enum  ResultEnums {
    LOGIN_FAIL(101,"登录失败"),



    ;


    private  int code;
    private  String msg;
    ResultEnums(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
