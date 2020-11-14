package com.example.gateway.configure;

import org.springframework.context.annotation.*;
import org.springframework.session.data.mongo.*;
import org.springframework.session.data.mongo.config.annotation.web.http.*;

import java.time.*;

@EnableMongoHttpSession
@Configuration
public class HttpSessionConfig {

    @Bean
    public JdkMongoSessionConverter jdkMongoSessionConverter() {
        return new JdkMongoSessionConverter(Duration.ofMinutes(30));
    }
}
