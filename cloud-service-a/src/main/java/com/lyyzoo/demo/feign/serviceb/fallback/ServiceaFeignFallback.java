package com.lyyzoo.demo.feign.serviceb.fallback;

import com.lyyzoo.demo.dto.User;
import com.lyyzoo.demo.feign.serviceb.feign.IServiceaFeign;

import java.util.List;

/**
 * 回调函数处理类
 *
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-16 15:50
 */
public class ServiceaFeignFallback implements IServiceaFeign {

    @Override
    public List<User> queryUsers() {
        return null;
    }
}
