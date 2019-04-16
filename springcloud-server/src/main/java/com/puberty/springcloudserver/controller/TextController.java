package com.puberty.springcloudserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TextController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test() {
        return "server被调用了！:" + port;
    }

}
