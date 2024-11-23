package com.eternity.code.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home Method Called ");
        return "index";
    }

    @RequestMapping("add")
    public String add(int num1, int num2, Model model)
    {
        System.out.println("Add Method called");

        int result = num1 + num2;

        model.addAttribute("results", result);

        return "result";
    }
}
