package com.hans.consumer.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hans
 * @Date: 2021/12/12 15:06
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
