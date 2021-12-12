package com.hans.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hans
 * @Date: 2021/12/12 15:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer statusCode;
    private String message;
    private Object data;
}
