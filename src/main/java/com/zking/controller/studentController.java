package com.zking.controller;

import com.alibaba.fastjson.JSON;

import com.zking.dao.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zking.entity.student;
import java.util.List;

@Controller
public class studentController {

    @Autowired
    studentMapper studentMapper;

    @ResponseBody
    @RequestMapping("selectByPrimaryKey")
    public String selectByPrimaryKey(){
        student student = studentMapper.selectByPrimaryKey(1);
        String data = JSON.toJSONString(student);
        return data;
    }


    @ResponseBody
    @RequestMapping("getStudent")
    public String getStudent(){
        List<student> student = studentMapper.getStudent();
        String data = JSON.toJSONString(student);
        return data;
    }

}