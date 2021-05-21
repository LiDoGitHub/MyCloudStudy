package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiDo
 * @create 2021-05-21 21:09
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PayMain8006 {
	public static void main(String[] args) {
		SpringApplication.run(PayMain8006.class, args);
	}
}
