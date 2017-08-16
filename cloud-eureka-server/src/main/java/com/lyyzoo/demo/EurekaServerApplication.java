package com.lyyzoo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现端 (服务端)
 * <p/>
 * 通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。
 * 这一步非常的简单，只需要在一个普通的Spring Boot应用中添加这个注解就能开启此功能
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
