package com.lyyzoo.demo.feign.serviceb.feign;

import com.lyyzoo.demo.dto.User;
import com.lyyzoo.demo.feign.serviceb.fallback.ServiceaFeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-16 15:49
 */
@FeignClient(value = "SERVICE-B", fallback = ServiceaFeignFallback.class)
public interface IServiceaFeign {

    @RequestMapping(value = "/users/list", method = RequestMethod.GET)
    List<User> queryUsers();

}
