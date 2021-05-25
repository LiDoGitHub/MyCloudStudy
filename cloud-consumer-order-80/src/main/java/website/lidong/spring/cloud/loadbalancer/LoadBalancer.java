package website.lidong.spring.cloud.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author LiDo
 * @create 2021-05-25 22:07
 **/
public interface LoadBalancer {
	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
