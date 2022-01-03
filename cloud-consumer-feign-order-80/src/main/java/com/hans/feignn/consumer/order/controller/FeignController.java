package com.hans.feignn.consumer.order.controller;

import com.hans.common.entities.CommonResult;
import com.hans.common.entities.Payment;
import com.hans.feignn.consumer.order.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hans
 * @Date: 2022/1/3 19:44
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService service;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id) {
        return service.getPayment(id);
    }

    @GetMapping("/timeout")
    public String paymentTimeout() {
        return service.paymentTimeout();
    }
}
