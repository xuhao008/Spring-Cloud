package com.xkkj.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: TokenFilter
 * @author: xuhao
 * @time: 2019/12/14 11:44
 */
@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 可以在请求被路由之前调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否执行该过滤器，此处为true，说明需要过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context  = RequestContext.getCurrentContext();
        HttpServletRequest request = context .getRequest();

        // 获取请求的参数
        String token = request.getParameter("token");
        if (token!=null) {
            //对请求进行路由
            context .setSendZuulResponse(true);
            context .setResponseStatusCode(200);
            context .set("msg", true);
            return null;
        } else {
            //不对其进行路由
            context .setSendZuulResponse(false);
            context .setResponseStatusCode(400);
            context .setResponseBody("ERROR");
            context .set("msg", false);
            return null;
        }
    }
}
