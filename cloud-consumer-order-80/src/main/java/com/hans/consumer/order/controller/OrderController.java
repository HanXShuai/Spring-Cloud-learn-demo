package com.hans.consumer.order.controller;

import com.hans.common.entities.CommonResult;
import com.hans.common.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hans
 * @Date: 2021/12/12 14:57
 */
@RestController
@RequestMapping("/comsumer")
public class OrderController {
    public static final String PAYMENT_URL = "http://PROVIDER-PAYMENT";

    @Autowired
    private RestTemplate template;

    @GetMapping("/payment/create")
    public CommonResult<Payment> createPayment(Payment payment) {
        return template.getForObject(PAYMENT_URL + "/create", CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id) {
        return template.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
