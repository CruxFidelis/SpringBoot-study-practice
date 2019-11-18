package com.crux.springbootExercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * SpringBoot HelloWorld
 * @author wushuhua
 * @date 2019/11/14 0:59
 */

@Controller
public class HelloWorld {

    @RequestMapping("/helloWorld")
    @ResponseBody
    public Map<String,Object> showHelloWorld(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg","HelloWorld");
        return map;
    }
}
