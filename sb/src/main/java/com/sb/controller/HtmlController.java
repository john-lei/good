package com.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by john on 2017/12/11.
 */
@Controller
public class HtmlController {

    @GetMapping("login")
    public String toLogin(){
        return "login";
    }

    @GetMapping("success")
    public String toSuccess(){
        return "success";
    }

    @GetMapping("error1")
    public String toError(){
        return "error1";
    }
}
