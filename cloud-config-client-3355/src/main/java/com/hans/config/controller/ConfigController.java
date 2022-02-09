package com.hans.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hans
 * @Date: 2022/2/9 23:05
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${version}")
    private String config;

    @GetMapping("/configInfo")
    public String getConfig() {
        return config;
    }
}
