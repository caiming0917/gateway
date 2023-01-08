package org.caijuan.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 开启 Eureka 服务
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication02 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication02.class, args);
    }

}
