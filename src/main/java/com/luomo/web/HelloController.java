package com.luomo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuMei
 * @date 2018-06-15.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "HelloWorld";
    }

}
