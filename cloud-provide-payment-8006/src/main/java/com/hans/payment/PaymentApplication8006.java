package com.hans.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: hans
 * @Date: 2021/12/13 23:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class, args);
    }
}
