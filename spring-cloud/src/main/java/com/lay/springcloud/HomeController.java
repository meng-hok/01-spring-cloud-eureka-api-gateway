package com.lay.springcloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/index")
    public Object home () {
        return "welcome to microservice";
    }

    @ResponseBody
    @RequestMapping("/v1/api/index")
    public Object apiResponse () {
        return "welcome to /v1/api/index";
    }
}