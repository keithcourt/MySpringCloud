package com.my.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:22 2018/4/27
 * @Modified By:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class FirstInvoker {
    public static void main(String[] args) {
        SpringApplication.run(FirstInvoker.class, args);
    }
}
