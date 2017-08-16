package com.lyyzoo.demo.controller;

import com.lyyzoo.demo.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 13:55
 */
@RestController
@RequestMapping("/compute")
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String consumer(){

        return computeService.add(100, 300);
    }

}
