package com.hans.hystrix.privade.payment.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: hans
 * @Date: 2022/1/3 21:05
 */
@Service
public class PaymentService {

    public String paymentInfoOk(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfoOk id : " + "\t,id";
    }

    public String paymentInfoTimeout(Integer id) {
        int timeNum = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfoTimeout id : " + "\t,id";
    }
}
