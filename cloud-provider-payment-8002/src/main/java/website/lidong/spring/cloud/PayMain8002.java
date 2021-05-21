package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LiDo
 * @create 2021-01-06 20:49
 **/
@SpringBootApplication
@EnableEurekaClient
public class PayMain8002 {
	public static void main(String[] args) {
		SpringApplication.run(PayMain8002.class, args);
	}
}
