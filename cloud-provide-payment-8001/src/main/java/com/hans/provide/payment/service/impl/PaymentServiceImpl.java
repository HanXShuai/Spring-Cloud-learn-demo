package com.hans.provide.payment.service.impl;

import com.hans.provide.payment.dao.IPaymentDao;
import com.hans.provide.payment.entities.Payment;
import com.hans.provide.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hans
 * @Date: 2021/12/11 17:47
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymentDao paymenttDao;

    @Override
    public Long createPayment(Payment payment) {
        paymenttDao.createPayment(payment);
        return payment.getId();
    }

    @Override
    public Payment queryPaymentById(Long id) {
        return paymenttDao.queryPaymentById(id);
    }
}
