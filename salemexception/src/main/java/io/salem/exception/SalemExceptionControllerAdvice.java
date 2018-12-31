package io.salem.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SalemExceptionControllerAdvice{

    @ExceptionHandler(SalemException.class)
    private ResponseEntity<SalemExceptionResponse> handleException(SalemException ex) {
        SalemExceptionResponse exceptionResponse = new SalemExceptionResponse(ex.getExceptionCode().getCode(),
                ex.getExceptionCode().getMessage());

        return ResponseEntity.status(ex.getExceptionCode().getHttpStatus()).body(exceptionResponse);
    }
}
