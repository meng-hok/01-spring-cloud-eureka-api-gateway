package com.example.gateway.configure;


import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SpringFoxConfig{
//        implements SwaggerResourcesProvider {
//    private SwaggerResource swaggerResource(String name, String location, String version) {
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(name);
//        swaggerResource.setLocation(location);
//        swaggerResource.setSwaggerVersion(version);
//        return swaggerResource;
//    }
////
//    @Override
//    public List get() {
//        List resources = new ArrayList<>();
//        resources.add(swaggerResource("springcloudservice", "/index/account/v2/api-docs", "2.0"));
////        resources.add(swaggerResource("customer-service", "/api/customer/v2/api-docs", "2.0"));
////        resources.add(swaggerResource("product-service", "/api/product/v2/api-docs", "2.0"));
////        resources.add(swaggerResource("transfer-service", "/api/transfer/v2/api-docs", "2.0"));
//        return resources;
//    }
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}