package website.lidong.spring.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiDo
 * @create 2021-05-25 21:36
 **/
@Configuration
@Slf4j
public class MyRibbonRule {
	@Bean
	public IRule myRule() {
		log.info("executed random rule......................");
		return new RandomRule();
	}
}
