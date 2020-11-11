package com.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @Autowired
    SpringCloudServiceFeign serviceFeign;

    @RequestMapping("/api/gateway")
    public Object index(){
        return "welcome to gateway controller";
    }

    @RequestMapping("/api/other/service")
    public Object other() {
        return serviceFeign.getIndex();
    }
}
