package website.lidong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@NacosProperties(serverAddr = "127.0.0.1:8848",namespace="2247842c-f0a1-4ffa-a9a0-171bf7bdd95a",)
@EnableDiscoveryClient
public class PayMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8005.class, args);
    }
}
