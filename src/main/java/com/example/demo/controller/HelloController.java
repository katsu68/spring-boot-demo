package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/")
    private String hello(){
        return "Hello world!!!";
    }

    @RequestMapping(value="/rest/{path}")
    private String rest(@PathVariable String path){
        return "rest path";
    }

    @RequestMapping(value="/requireParam")
    private String requireParam(@RequestParam String param){
        return "require param => " + param;
    }

    @RequestMapping(value="/optinalParam")
    private String optinalParam(@RequestParam(name = "param", required = false) Optional<String> param){
        return "optinal param => " + param;
    }
}