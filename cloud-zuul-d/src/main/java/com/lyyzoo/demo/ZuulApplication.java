package com.lyyzoo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.lyyzoo.demo.filter.ErrorFilter;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	/**
	 * 在实现了自定义过滤器之后，还需要实例化该过滤器才能生效，只需要在应用主类中增加如下内容：
	 */
	//@Bean
	//public AccessFilter accessFilter(){
	//	return new AccessFilter();
	//}
    //
	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}

}
