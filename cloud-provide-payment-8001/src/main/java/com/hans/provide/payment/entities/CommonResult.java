package com.hans.provide.payment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hans
 * @Date: 2021/12/11 17:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer statusCode;
    private String message;
    private Object data;
}
