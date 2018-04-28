package com.my.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:22 2018/4/27
 * @Modified By:
 */

@SpringBootApplication
@EnableEurekaServer
public class FirstServer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profiles = scanner.nextLine();
        new SpringApplicationBuilder(FirstServer.class).profiles(profiles).run(args);
    }
}
