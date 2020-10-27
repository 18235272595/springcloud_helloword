package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lhq
 * @Date: 2020/10/21 10:17
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderMovieStart {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMovieStart.class);
    }
}
