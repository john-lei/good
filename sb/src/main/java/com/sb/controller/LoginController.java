package com.sb.controller;

import com.sb.bean.info;
import com.sb.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class LoginController {

    @Autowired
    InfoService infoService;

    @RequestMapping(value = "ajaxLogin",method = GET)
    public String ajaxLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        info myinfo = new info(username,password);
        if (infoService.checkUser(myinfo)!=null){
            return "success";
        }
        return "error1";
    }



}