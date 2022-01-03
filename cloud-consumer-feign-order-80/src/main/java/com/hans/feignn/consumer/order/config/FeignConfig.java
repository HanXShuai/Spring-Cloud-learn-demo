package com.hans.feignn.consumer.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hans
 * @Date: 2022/1/3 20:28
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level getLevel() {
        return Logger.Level.FULL;
    }
}
