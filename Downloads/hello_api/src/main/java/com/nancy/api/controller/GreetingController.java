package com.nancy.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    // the url: http://localhost:8080/greeting?name=Nancy
    // http://localhost:8080/greeting?name=Nancy&attendance=false
    //TODO Example of your capstone:
    // http://localhost:8080/tourid=4&pax2

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required=false, defaultValue = "World") String name,
        @RequestParam(name="attendance", required = false, defaultValue = "true") String attendance, Model model
    ){

        model.addAttribute("name", name);
        model.addAttribute("attendance", attendance);
        return "greeting";
    }
}
