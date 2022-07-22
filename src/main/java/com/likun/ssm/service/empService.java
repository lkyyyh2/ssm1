package com.likun.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.likun.ssm.mapper.EmpMapper;
import com.likun.ssm.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empService {
    @Autowired
    private EmpMapper empMapper;
    public PageInfo<Emp> getEmpList(Integer page){
        PageHelper.startPage(page,5);
        List<Emp> emps = empMapper.selectByExample(null);
        System.out.println(111);
        return new PageInfo<Emp>(emps, 3);
    }
}
