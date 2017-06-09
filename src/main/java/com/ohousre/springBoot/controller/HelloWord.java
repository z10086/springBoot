package com.ohousre.springBoot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by unknow on 2017/6/9.
 */

@Controller
@EnableAutoConfiguration
public class HelloWord {

    @RequestMapping("/")
    @ResponseBody
    String heoolWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWord.class, args);
    }
}
