package com.xq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class mainController {
   @RequestMapping("/main")
   public String mainC(){
       return "main";
   }
}
