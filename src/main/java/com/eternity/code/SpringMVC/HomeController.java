package com.eternity.code.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @ModelAttribute("name")
    public String headName()
    {
        return "Eternity";
    }

    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home Method Called ");
        return "index";
    }

    @RequestMapping("addUser")
    public String addUser(@ModelAttribute User user)
    {
        return "result";
    }
}
