package website.lidong.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import website.lidong.spring.cloud.service.PaymentService;
import website.lidong.spring.entities.CommonResult;
import website.lidong.spring.entities.Payment;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-18 10:43
 */
@RestController
@Slf4j
public class PaymentController {
	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@Resource
	private DiscoveryClient dc;

	@PostMapping(value = "/payment/create")
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("*****插入结果：" + result);

		if (result > 0) {
			return new CommonResult(200, "插入数据库成功,serverPort: " + serverPort, result);
		} else {
			return new CommonResult(444, "插入数据库失败", null);
		}
	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);

		if (payment != null) {
			return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
		} else {
			return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
		}
	}

	@GetMapping("/payment/discovery")
	public Object discovery() {
		List<String> list = dc.getServices();
		for (String element : list) {
			log.info("********** {}", element);
		}
		List<ServiceInstance> instances = dc.getInstances("cloud-payment-service");
		for (ServiceInstance element : instances) {
			log.info(element.getHost() + "/" + element.getServiceId() + "/" + element.getPort() + "/" + element.getUri());
		}
		return dc;
	}


}
