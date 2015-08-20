package com.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmybatis.service.EmployeeService;

@Controller
public class MybaticsController {

	@Autowired
    private EmployeeService employeeService;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody Integer index() {
        try {
        	employeeService.insert();
            return 1;
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        return 0;
    }  
}
