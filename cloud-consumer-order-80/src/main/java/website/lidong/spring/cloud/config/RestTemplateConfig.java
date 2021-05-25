package website.lidong.spring.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/*
 * 使用时,在主启动类上添加如下配置信息
 * @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRibbonRule.class)
 * */
@Configuration
public class RestTemplateConfig {
    @Bean
    //使用默认轮询算法时,打开下面这行的注释
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
