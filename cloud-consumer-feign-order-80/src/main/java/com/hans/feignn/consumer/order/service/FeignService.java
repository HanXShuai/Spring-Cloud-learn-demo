package com.hans.feignn.consumer.order.service;

import com.hans.common.entities.CommonResult;
import com.hans.common.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: hans
 * @Date: 2022/1/3 19:44
 */
@Component
@FeignClient("PROVIDER-PAYMENT")
public interface FeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") long id);

    @GetMapping("/payment/timeout")
    String paymentTimeout();
}
