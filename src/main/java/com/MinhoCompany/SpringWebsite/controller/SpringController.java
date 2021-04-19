package com.MinhoCompany.SpringWebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    @GetMapping("hello") //GET메소드
    public String hello(Model model) {
        model.addAttribute("data", "Heelo");
        return "hello";  //templates에 있는 hello.html을 렌더링 해준다.


    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello-templates";
    }
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody        //http body에 내용을 전달 객체:json, 문자:string 이 default
    public Hello helloApi(@RequestParam String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;
        private String number;


        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
    }
}
