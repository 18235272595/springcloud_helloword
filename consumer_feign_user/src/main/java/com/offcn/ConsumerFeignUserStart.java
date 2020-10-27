package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 11:38
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient    //相比 @EnableEurekaClient 范围大    注册中心可以是其它组件
@EnableFeignClients       //开启feign
@EnableCircuitBreaker //开启熔断机制
@EnableHystrixDashboard //开启熔断监控
public class ConsumerFeignUserStart {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignUserStart.class);
    }

}
