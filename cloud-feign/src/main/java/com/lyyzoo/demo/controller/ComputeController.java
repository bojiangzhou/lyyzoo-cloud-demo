package com.lyyzoo.demo.controller;

import com.lyyzoo.demo.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 14:56
 */
@RestController
public class ComputeController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(100, 200);
    }

}
