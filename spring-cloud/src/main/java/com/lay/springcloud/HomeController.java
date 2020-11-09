package com.lay.springcloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public Object home () {
        return "welcome to microservice";
    }

}