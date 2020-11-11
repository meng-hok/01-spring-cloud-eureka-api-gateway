package com.example.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("springcloudservice")
public interface SpringCloudServiceFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/api/index")
    String getIndex();
}
