package com.yjg.zwb.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MyController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
