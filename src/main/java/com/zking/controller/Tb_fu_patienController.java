package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.dao.PersonDao;
import com.zking.dao.tb_fu_patientMapper;
import com.zking.entity.person;
import com.zking.entity.tb_fu_patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * SSM+UI  CRUD
 */
@Controller
public class Tb_fu_patienController {
HttpServletResponse response;
    @Autowired
    tb_fu_patientMapper tb_fu_patientMapper;



    //增加
    @ResponseBody
    @RequestMapping("addTb_fu_patient")
    public String addTb_fu_patient(tb_fu_patient tb_fu_patient){
        System.out.println(tb_fu_patient.getPatient_name());

        tb_fu_patientMapper.addTb_fu_patient(tb_fu_patient);
        return "success";
    }



    //    查询单个所有
    @ResponseBody
    @RequestMapping("queryAllByTb_fu_patientId")
    public tb_fu_patient queryAllByTb_fu_patientId(int id){
        tb_fu_patient tb_fu_patient=tb_fu_patientMapper.queryAllByTb_fu_patientId(id);
        return tb_fu_patient;
    }

    //    查询最大id
    @ResponseBody
    @RequestMapping("getTb_fu_patientMaxId")
    public String getTb_fu_patientMaxId(){
        tb_fu_patient maxId=tb_fu_patientMapper.getTb_fu_patientMaxId();
        String data=JSON.toJSONString(maxId);
        return data;
    }

    //    查询所有数量
    @ResponseBody
    @RequestMapping("getCountTb_fu_patient")
    public String getCountTb_fu_patient(){
        tb_fu_patient count=tb_fu_patientMapper.getCountTb_fu_patient();
        String data=count.getCount().toString();
        return data;
    }

    //    模糊查询
    @ResponseBody
    @RequestMapping("queryLikeTb_fu_patient")
    public List<tb_fu_patient> queryLike(tb_fu_patient tb_fu_patient){
        List<tb_fu_patient> list=tb_fu_patientMapper.queryLikeTb_fu_patient(tb_fu_patient);
        return list;
    }

    //    分页查询
    @ResponseBody
    @RequestMapping("pageQueryTb_fu_patient")
    public List<tb_fu_patient> pageQueryTb_fu_patient(int begin){
        List<tb_fu_patient> list=tb_fu_patientMapper.pageQueryTb_fu_patient(begin);
        return list;
    }


    //    删除
    @ResponseBody
    @RequestMapping("delTb_fu_patient")
    public String  delTb_fu_patient(int id){
        System.out.println("删除");
        tb_fu_patientMapper.delTb_fu_patient(id);
        return "success";
    }


    //    修改
    @ResponseBody
    @RequestMapping("updateTb_fu_patient")
    public String  updateTb_fu_patient(tb_fu_patient tb_fu_patient){
        tb_fu_patientMapper.updateTb_fu_patient(tb_fu_patient);
        return "success";
    }







}
