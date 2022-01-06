package com.hans.hystrix.privade.payment.controller;

import com.hans.hystrix.privade.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hans
 * @Date: 2022/1/3 20:52
 */
@RestController
@RequestMapping("/hystrix")
@Slf4j
public class HystrixController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfoOk(id);
        log.info("paymentInfoOk result : {}", result);
        return result;
    }

    @GetMapping("/payment/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id) {
        String timeout = paymentService.paymentInfoTimeout(id);
        log.info("paymentInfoTimeout result : {}", timeout);
        return timeout;
    }
}
