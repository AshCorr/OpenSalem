package io.salem.exception;

import org.springframework.http.HttpStatus;

public enum SalemGenericExceptionCode {
    RESPONSE_OK(HttpStatus.OK, "Ok.", 200);

    private HttpStatus httpStatus;
    private String message;
    private int code;

    SalemGenericExceptionCode(HttpStatus httpStatus, String message, int code) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.code = code;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
