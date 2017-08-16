package com.lyyzoo.demo.fallback;

import com.lyyzoo.demo.client.ComputeClient;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 16:10
 */
@Component
public class ComputeFallback implements ComputeClient {

    /**
     * 该实现的方法就是对应的回调方法
     */
    @Override
    public Integer add(Integer a, Integer b) {
        return -99999;
    }
}
