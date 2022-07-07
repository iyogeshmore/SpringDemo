package com.example.firstspringapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value= {"","/","/home"})
    public String Print()
    {
        return "Hello From Bridgelabz";
    }
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String Print(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
}
