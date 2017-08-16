package com.lyyzoo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 15:48
 */
@Service
public class ComputeService {

	@Autowired
	RestTemplate restTemplate;

	/**
	 * @ HystrixCommand注解来指定回调方法
	 */
	@HystrixCommand(fallbackMethod = "" + "")
	public String add(Integer a, Integer b) {
		return restTemplate.getForEntity("http://SERVICE-A/compute/add?a=" + a + "&b=" + b, String.class).getBody();
	}

	public String addFallback(Integer a, Integer b) {
		return "error";
	}

}
