package com.xq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class encyclopediaController {
    @Value("#{${external-api}}")
    Map<String,String> apiMap;
    //用Watt Toolkit(Steam++)访问这个网站，
    @RequestMapping("/encyclopedia/{apisort}/{sort}")
    public String GetInfomatinoOfIndex(@PathVariable("apisort")String apisort,@PathVariable("sort")String sort)
    {
         return"";
    }

}
