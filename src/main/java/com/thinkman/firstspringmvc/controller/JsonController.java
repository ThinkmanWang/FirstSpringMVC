package com.thinkman.firstspringmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangx on 2017-02-07.
 */
@RestController
public class JsonController {

    @RequestMapping(value = "/jsontest", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String jsonTestController() {
        return "{\"code\":0, \"msg\":\"success\"}";
    }

}
