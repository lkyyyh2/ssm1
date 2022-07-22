package com.likun.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.likun.ssm.pojo.Emp;
import com.likun.ssm.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class empController {
    @Autowired
    private empService empService;
    @GetMapping("/index")
    public String index(){
        System.out.println("哈哈");
        return "index";
    }
    @GetMapping("/getList")
    @ResponseBody
    public PageInfo<Emp> getList(Integer page){
        PageInfo<Emp> empList = empService.getEmpList(page);
        return empList;
    }

}
