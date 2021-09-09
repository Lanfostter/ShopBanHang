package com.example.ShopDemo.Hello;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionController {
    public String nullPointer(Exception ex){
        ex.printStackTrace();
        return "nullPointer";
    }
}
