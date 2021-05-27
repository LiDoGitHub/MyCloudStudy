package website.lidong.spring.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import website.lidong.spring.entities.CommonResult;
import website.lidong.spring.entities.Payment;

/**
 * @author LiDo
 * @create 2021-05-27 20:40
 **/
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentServiceInterface {

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();
}
