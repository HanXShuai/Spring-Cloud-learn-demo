package com.hans.provide.payment.controller;

import com.hans.common.entities.CommonResult;
import com.hans.common.entities.Payment;
import com.hans.provide.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hans
 * @Date: 2021/12/11 17:38
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment) {
        Long result = paymentService.createPayment(payment);
        log.info("result : {}", result);
        if (result > 0) {
            return new CommonResult(200, "insert success : " + port, result);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult queryPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.queryPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "insert success : " + port, payment);
        } else {
            return new CommonResult(500, "insert fail", null);
        }
    }

    @GetMapping("/discovery")
    public Object getDiscovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service : {}", service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            log.info("instanceId : {}, host : {}, port : {}, uri : {}", instance.getInstanceId(), instance.getHost(),
            instance.getPort(), instance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("/lb")
    public String getPort() {
        return port;
    }

    @GetMapping("/timeout")
    public String paymentTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
