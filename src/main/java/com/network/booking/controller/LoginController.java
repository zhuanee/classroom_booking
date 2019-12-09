package com.network.booking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("/login")
    public String login(HttpSession session, String username, String password, Map<String, Object> map){
        System.out.println(username);
        System.out.println(password);
        if(!StringUtils.isEmpty(username) && "123".equals(password))
        {
            System.out.println(username);
            System.out.println(password);
            logger.info(username);
            logger.info(password);
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        map.put("msg", "用户名或密码错误");
        return  "main/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginUser");
        session.invalidate();
        return "redirect:/index.html";
    }
}
