package com.lyyzoo.demo.client;

import com.lyyzoo.demo.fallback.ComputeFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 14:49
 */
@FeignClient(value = "SERVICE-A", fallback = ComputeFallback.class)
public interface ComputeClient {

    @RequestMapping(value = "/compute/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
