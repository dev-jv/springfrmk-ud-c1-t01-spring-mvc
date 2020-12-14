package com.bolsadeideas.springboot.web.app.springfrmkudc1t01springmvc.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class IndexController {
//    @RequestMapping(path="/index", method= RequestMethod.GET)
//    @RequestMapping(value="/index", method= RequestMethod.GET)
//    @GetMapping({"/index", "/", "/home"})
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
