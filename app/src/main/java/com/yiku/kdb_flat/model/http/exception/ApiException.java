package com.yiku.kdb_flat.model.http.exception;

/**
 * Created by jame on 2018/5/2.
 */

public class ApiException extends Exception{
    private String code="";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApiException(String msg) {
        super(msg);
    }

    public ApiException(String msg, String code) {
        super(msg);
        this.code = code;
    }

}
