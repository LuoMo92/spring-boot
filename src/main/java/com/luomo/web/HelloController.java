package com.luomo.web;

import com.luomo.exception.MyException;
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
        return "Hello World";
    }

    @RequestMapping("/json")
    public String json() throws MyException{
        throw new MyException("发生错误");
    }
}
