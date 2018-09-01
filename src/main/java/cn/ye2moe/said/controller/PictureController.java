package cn.ye2moe.said.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PictureController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
