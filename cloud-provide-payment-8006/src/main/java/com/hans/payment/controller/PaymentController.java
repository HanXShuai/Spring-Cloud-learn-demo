package com.hans.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hans
 * @Date: 2021/12/13 23:30
 */
@RestController
public class PaymentController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello consul";
    }
}
