package com.company.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RouterController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index"); // 视图的名称，这里假设视图名称为"index"
        // 你可以在这里添加一些数据到视图中，供HTML页面使用
        modelAndView.addObject("message", "Hello, this is a message from the controller!");
        return modelAndView;
    }
}
