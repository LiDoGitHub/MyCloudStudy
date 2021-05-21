package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LiDo
 * @create 2021-01-05 20:04
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PayMain8001.class, args);
	}
}
