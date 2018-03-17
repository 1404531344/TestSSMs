package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.dao.tb_fu_officeMapper;
import com.zking.entity.tb_fu_office;
import com.zking.entity.tb_fu_patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * SSM+UI  CRUD//
//import java.util.List;
//
 */
@Controller
public class Tb_fu_officeController {
    @Autowired
    tb_fu_officeMapper tb_fu_officeMapper;





    //增加
    @ResponseBody
    @RequestMapping("insertOffice")
    public String insertOffice(tb_fu_office person){
        tb_fu_officeMapper.insertOffice(person);
        return "success";
    }


    //    查询单个所有
    @ResponseBody
    @RequestMapping("queryAllByIdOffice")
    public tb_fu_office queryAllByIdOffice(int id){
        tb_fu_office tb_fu_office=tb_fu_officeMapper.queryAllByIdOffice(id);
        return tb_fu_office;
    }

    //    查询最大id
    @ResponseBody
    @RequestMapping("getMaxIdOffice")
    public String getMaxIdOffice(){
        tb_fu_office maxId=tb_fu_officeMapper.getMaxIdOffice();
        String data=JSON.toJSONString(maxId);
        return data;
    }


    //    模糊查询
    @ResponseBody
    @RequestMapping("queryLikeTb_fu_office")
    public List<tb_fu_office> queryLikeTb_fu_office(tb_fu_office person){
        System.out.println(person.getOffice_name());
        List<tb_fu_office> list=tb_fu_officeMapper.queryLikeTb_fu_office(person);
        return list;
    }

    //    分页查询
    @ResponseBody
    @RequestMapping("pageQueryTb_fu_office")
    public List<tb_fu_office> pageQueryTb_fu_office(int begin) {
        System.out.println("模糊查询");
        List<tb_fu_office> list = tb_fu_officeMapper.pageQueryTb_fu_office(begin);
        return list;
    }


    //    删除
    @ResponseBody
    @RequestMapping("deleteByPrimaryKeyOffice")
    public String  deleteByPrimaryKeyOffice(int id){
        System.out.println("删除");
        tb_fu_officeMapper.deleteByPrimaryKeyOffice(id);
        return "success";
    }


    //    修改
    @ResponseBody
    @RequestMapping("updateByPrimaryKeyOffice")
    public String  updateByPrimaryKeyOffice(tb_fu_office person){
        tb_fu_officeMapper.updateByPrimaryKeyOffice(person);
        return "success";
    }


    //    查询所有数量
    @ResponseBody
    @RequestMapping("getCountOffice")
    public String getCountOffice(){
        tb_fu_office count=tb_fu_officeMapper.getCountOffice();
        String data=count.getCount().toString();
        return data;
    }



}
