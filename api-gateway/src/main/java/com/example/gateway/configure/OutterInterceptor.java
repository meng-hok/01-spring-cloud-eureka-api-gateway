package com.example.gateway.configure;

import org.springframework.stereotype.*;
import org.springframework.web.servlet.*;

import javax.servlet.http.*;

@Component
public class OutterInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==============> INTERCEPTOR PRE HANDLE <================");
        return true;
    }

}
