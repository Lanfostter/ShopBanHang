package com.example.ShopDemo.Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @Autowired
    Environment environment;

    public String home(HttpServletRequest request) {
        request.setAttribute("msg", environment.getProperty("message"));
        return "index";
    }
}
