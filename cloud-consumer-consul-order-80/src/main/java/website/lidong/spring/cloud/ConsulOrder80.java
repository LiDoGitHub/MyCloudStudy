package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiDo
 * @create 2021-05-21 21:53
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {
	public static void main(String[] args) {
		SpringApplication.run(ConsulOrder80.class, args);
	}
}
