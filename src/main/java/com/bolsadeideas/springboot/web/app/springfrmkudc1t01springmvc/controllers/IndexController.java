package com.bolsadeideas.springboot.web.app.springfrmkudc1t01springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import java.util.Map;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    // ---------------------------------- <> Model / interface
//    @GetMapping({"/index", "/", "/home"})
//    public String index(Model mod){
//        mod.addAttribute("titulo", "Although");
//        return "index";
//    }
    // ---------------------------------- <> ModelMap / class ..
//    @GetMapping({"/index", "/", "/home"})
//    public String index(ModelMap mod){
//        mod.addAttribute("titulo", "Although2.0");
//        return "index";
//    }
    // ---------------------------------- <> Map<String, Object>  / interface
//    @GetMapping({"/index", "/", "/home"})
//    public String index(Map<String, Object> map){
//        map.put("titulo", "Although3.0");
//        return "index";
//    }
    // ---------------------------------- <> ModelAndView / class
    @GetMapping({"/index", "/", "/home"})
    public ModelAndView index(ModelAndView mv){
        mv.addObject("titulo", "Although4.0");
        mv.setViewName("index");
        return mv;
    }
}



