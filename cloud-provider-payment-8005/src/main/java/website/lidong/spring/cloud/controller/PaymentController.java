package website.lidong.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testConfig")
@RefreshScope
public class PaymentController {

    @Value("${lido.spring.cloud.nacos.test}")
    private String configFile;

    @PostMapping("/get")
    public String get() {
        return configFile;
    }
}
