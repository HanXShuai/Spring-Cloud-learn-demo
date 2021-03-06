package com.hans.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hans
 * @Date: 2021/12/12 13:25
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class, args);
    }
}
