package com.eternity.code.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home()
    {
        System.out.println("Home Method Called ");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(int num1, int num2, Model model)
    {
        System.out.println("Add Method called");

        int result = num1 + num2;

        model.addAttribute("results", result);

        return "result.jsp";
    }
}
