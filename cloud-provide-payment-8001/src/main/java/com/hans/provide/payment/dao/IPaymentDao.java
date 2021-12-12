package com.hans.provide.payment.dao;

import com.hans.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hans
 * @Date: 2021/12/11 17:43
 */
@Mapper
public interface IPaymentDao {

    int createPayment(Payment payment);

    Payment queryPaymentById( Long id);
}