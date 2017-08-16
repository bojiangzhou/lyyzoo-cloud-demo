package com.lyyzoo.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 *     路由功能在真正运行时，它的路由映射和请求转发都是由几个不同的过滤器完成的。
 *     其中，路由映射主要通过pre类型的过滤器完成，它将请求路径与配置的路由规则进行匹配，以找到需要转发的目标地址；
 *     而请求转发的部分则是由route类型的过滤器来完成，对pre类型过滤器获得的路由地址进行转发。
 *     所以，过滤器可以说是Zuul实现API网关功能最为核心的部件，每一个进入Zuul的HTTP请求都会经过一系列的过滤器处理链得到请求响应并返回给客户端。
 * </pre>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 22:47
 */
//@Component
public class ErrorFilter extends ZuulFilter {

    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 11;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        Throwable throwable = ctx.getThrowable();
        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        if(response.getStatus() != HttpStatus.OK.value()){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(response.getStatus());
            ctx.set("error.status_code", response.getStatus());
            ctx.setResponseBody("error");
            return null;
        }
        return null;
    }
}
