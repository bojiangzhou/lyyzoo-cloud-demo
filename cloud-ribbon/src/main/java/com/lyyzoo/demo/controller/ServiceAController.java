package com.lyyzoo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 13:55
 */
@RestController
@RequestMapping("/consumer")
public class ServiceAController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public String consumer(){
        Logger logger = Logger.getLogger(this.getClass().getName());
        String results = restTemplate.getForEntity("http://SERVICE-A/compute/add?a=100&b=30", String.class).getBody();

        return "results: " + results;
    }

}
