package website.lidong.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import website.lidong.spring.cloud.service.PaymentServiceInterface;
import website.lidong.spring.entities.CommonResult;
import website.lidong.spring.entities.Payment;

import javax.annotation.Resource;

/**
 * @author LiDo
 * @create 2021-05-27 20:46
 **/
@RestController
@Slf4j
public class OrderFeignController {
	@Resource
	private PaymentServiceInterface psi;

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		log.info("收到请求.................................");
		return psi.getPaymentById(id);
	}

	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout() {
		//openFeign-ribbon,默认一般等待1秒钟
		return psi.paymentFeignTimeout();
	}
}
