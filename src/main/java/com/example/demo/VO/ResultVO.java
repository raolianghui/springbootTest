package com.example.demo.VO;

/**
 * Created by T009538 on 2019/5/18.
 */
public class ResultVO {
    private int error_code;
    private String msg;
    private Object data;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
