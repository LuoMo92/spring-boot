package com.luomo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ErrorInfo defaultErrorHandler(HttpServletRequest request, Exception e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setMessage(e.getMessage());
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("test");
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }

}
