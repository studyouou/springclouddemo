package org.ougen.springclouddemozuul.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Author: OuGen
 * Discription:
 * Date: 23:15 2019/7/29
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //pre路由之前,routing路由之时,post路由之后,error错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        //越小越先使用
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = (String) request.getParameter("token");
        if (token==null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(404);
            try {
                context.getResponse().getWriter().write("token is emtry");
            } catch (IOException e) {

            }
        }
        return null;
    }
}
