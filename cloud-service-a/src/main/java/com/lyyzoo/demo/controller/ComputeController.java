package com.lyyzoo.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-13 23:23
 */
@RestController
@RequestMapping("/compute")
public class ComputeController {

    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/add")
    public Integer add(Integer a, Integer b){
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer ret = a + b;
        logger.info("/add, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId() + ", result:" + ret);
        return ret;
    }

    @RequestMapping("/reduce")
    public Integer reduce(){
        logger.info("/reduce, exception test");
        int a = 1;
        int m = a / 0; //异常
        return 0;
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "You askd my to say hello";
    }

}
