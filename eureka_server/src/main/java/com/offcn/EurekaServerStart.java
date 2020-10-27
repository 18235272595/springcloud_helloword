package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 09:53
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer //开启注册中心的声明
public class EurekaServerStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class);
    }
}
