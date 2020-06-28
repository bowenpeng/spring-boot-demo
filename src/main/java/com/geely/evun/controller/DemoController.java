package com.geely.evun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value="/")
    String demo(){
        return "Hello World!";
    }
}
