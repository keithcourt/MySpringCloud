package com.my.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:22 2018/4/27
 * @Modified By:
 */

@SpringBootApplication
@EnableEurekaClient
public class FirstServiceProvider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        new SpringApplicationBuilder(FirstServiceProvider.class).properties("server.port=" + port).run(args);
    }
}
