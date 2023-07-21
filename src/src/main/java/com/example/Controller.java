package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class Controller {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/hello", method = RequestMethod.GET,headers="Accept=application/json")
    public String hello(){
        return "{\"hello\":\""+ environment.getProperty("person") +"\"}";
    }
}
