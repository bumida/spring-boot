package com.example.demo.controller;

import com.example.demo.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {




    // SSR -> jsp, thymeleaf, mustache, freemarker
    // SPA ->
    // vue -> vue + SSR = nuxt.js
    // react -> react+ SSR = nest
    @GetMapping("/post")
    public String post(@RequestBody PostCreate params) throws Exception {
       log.info("params={}", params.toString());



       String title = params.getTitle();
       if(title == null || title.isEmpty()){
           throw new Exception("타이틀 값이 없어요.");

       }




        return "Hello World";
    }


}
