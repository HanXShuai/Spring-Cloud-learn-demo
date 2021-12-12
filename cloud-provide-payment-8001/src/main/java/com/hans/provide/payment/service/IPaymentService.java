package com.hans.provide.payment.service;

import com.hans.provide.payment.entities.Payment;

/**
 * @Author: hans
 * @Date: 2021/12/11 17:46
 */
public interface IPaymentService {
    Long createPayment(Payment payment);

    Payment queryPaymentById(Long id);
}