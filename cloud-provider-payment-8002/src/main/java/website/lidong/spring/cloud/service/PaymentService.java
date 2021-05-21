package website.lidong.spring.cloud.service;

import org.apache.ibatis.annotations.Param;
import website.lidong.spring.entities.Payment;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
public interface PaymentService {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
