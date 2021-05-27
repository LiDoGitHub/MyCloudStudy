package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiDo
 * @create 2021-05-27 20:36
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignOrder80 {
	public static void main(String[] args) {
		SpringApplication.run(FeignOrder80.class, args);
	}
}
