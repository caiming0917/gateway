package org.caijuan.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// 自定义配置 RestTemplate
@Configuration
// 指定为 userservice 服务，只要是调用此服务都会使用我们指定的策略；指定我们刚刚定义好的配置类
@LoadBalancerClient(value = "product",configuration = LoadBalancerConfig.class)
public class BeanConfig {

    @Bean
//    @LoadBalanced  // 服务注册与发现 + 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
