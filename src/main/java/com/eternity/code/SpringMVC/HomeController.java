package com.eternity.code.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home Method Called ");
        return "index";
    }

    @RequestMapping("addUser")
    public ModelAndView addUser(int id, String name, ModelAndView mv)
    {
        System.out.println("Add Method called");
        User user = new User();
        user.setId(id);
        user.setName(name);

        mv.addObject("results",user);
        mv.setViewName("result");

        return mv;
    }
}
