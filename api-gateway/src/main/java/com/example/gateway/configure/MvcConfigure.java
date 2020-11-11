package com.example.gateway.configure;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigure implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor().addPathPatterns("/index/**");
//    }
    @Bean
    @Order(1)
    public FilterRegistrationBean<OutterFilter> loggingFilter(){
        System.out.println("My Configuration==================");
        FilterRegistrationBean<OutterFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new OutterFilter());
        registrationBean.addUrlPatterns("/*");

        return registrationBean;
}
}
