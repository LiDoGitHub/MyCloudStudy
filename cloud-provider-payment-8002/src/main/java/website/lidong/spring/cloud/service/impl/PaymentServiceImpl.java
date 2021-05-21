package website.lidong.spring.cloud.service.impl;

import org.springframework.stereotype.Service;
import website.lidong.spring.cloud.mapper.PaymentDao;
import website.lidong.spring.cloud.service.PaymentService;
import website.lidong.spring.entities.Payment;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentDao paymentDao;

	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
