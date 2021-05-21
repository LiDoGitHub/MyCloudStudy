package website.lidong.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import website.lidong.spring.entities.CommonResult;
import website.lidong.spring.entities.Payment;

import javax.annotation.Resource;

/**
 * @author LiDo
 * @create 2021-01-06 19:30
 **/
@RestController
@RequestMapping("/consumer")
public class OrderController {

	//	private static final String URL = "http://127.0.0.1:8001";
	private static final String URL = "http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate template;

	@GetMapping("/payment/create")
	public CommonResult create(Payment payment) {
		return template.postForObject(URL + "/payment/create", payment, CommonResult.class);
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult getPayment(@PathVariable("id") Long id) {
		return template.getForObject(URL + "/payment/get/" + id, CommonResult.class);
	}

	@GetMapping("/payment/get1/{id}")
	public CommonResult getPayment1(@PathVariable("id") Long id) {
		return template.getForEntity(URL + "/payment/get/" + id, CommonResult.class).getBody();
	}

	@GetMapping("/payment/create1")
	public CommonResult create1(Payment payment) {
		return template.postForEntity(URL + "/payment/create", payment, CommonResult.class).getBody();
	}
}
