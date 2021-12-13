package com.hans.provide.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: hans
 * @Date: 2021/12/12 23:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymnetApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymnetApplication8004.class, args);
    }
}
