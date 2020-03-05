package com.funtl.itoken.admin.feign.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class LoginFileter extends ZuulFilter {

    @Override
    public String filterType() {
//        pre 执行之前过滤
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//        是否需要过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext current=RequestContext.getCurrentContext();
        HttpServletRequest request=current.getRequest();
        String token=request.getParameter("token");
        if (token == null) {
            current.setSendZuulResponse(false);
            current.setResponseStatusCode(401);
            try {
                HttpServletResponse response=current.getResponse();
                response.setContentType("text/html;charset=utf-8");
                current.getResponse().getWriter().write("非法请求");
            }catch (Exception e){
                e.printStackTrace();
            }


        }


        return null;
    }

}
