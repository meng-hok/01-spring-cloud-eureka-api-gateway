package com.example.gateway.configure;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

//@Component to all url
//@Order(1)
public class OutterFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("=================================OutterFilter=============================");
        System.out.println(request);
        chain.doFilter(request, response);
    }
}
