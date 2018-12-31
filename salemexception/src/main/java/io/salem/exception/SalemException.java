package io.salem.exception;

public class SalemException extends RuntimeException {
    private SalemGenericExceptionCode exceptionCode;

    public SalemException(SalemGenericExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public SalemGenericExceptionCode getExceptionCode() {
        return exceptionCode;
    }
}
