package com.thinkman.firstspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangx on 2017-02-07.
 */
@Controller
public class FirstController {

    @RequestMapping("/hello")
    public ModelAndView welcomeMessage(
            @RequestParam(value = "name", required = false) String name) {
        // Name of your jsp file as parameter
        ModelAndView view = new ModelAndView("hello");
        view.addObject("name", name);
        return view;
    }

}
