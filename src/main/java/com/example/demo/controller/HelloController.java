package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        System.out.println("dddd");
        model.addAttribute("data", "hello!");
        return "index";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody//HTTP 바디부에 데이터를 직접 넣어주겠다는 어노테이션
    public String helloString(@RequestParam("name") String name) {
        return "hello!!" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody//HTTP 바디부에 데이터를 직접 넣어주겠다는 어노테이션
    public Hello helloApi(@RequestParam("name") String name) {
       Hello hello = new Hello();
       hello.setName(name);


        return hello;
    }


    @Setter
    @Getter
    static class Hello{
        private String name;
    }

}
