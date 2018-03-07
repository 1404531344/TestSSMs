package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.dao.PersonDao;
import com.zking.entity.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * SSM+UI  CRUD
 */
@Controller
public class PersonController {

    @Autowired
    private PersonDao personDao;





    //增加
    @ResponseBody
    @RequestMapping("addPerson")
    public String addPerson(person person){
        System.out.println("增加");
        personDao.addPerson(person);
        System.out.println(person.getPname());
        System.out.println(person.getPage());
        return "success";
    }

//    查询所有
    @ResponseBody
    @RequestMapping("getPersons")
    public String getPersons(){
        System.out.println("查询所有");
        List<person> list=personDao.getPersons();
        String data = JSON.toJSONString(list);
        return data;
    }

    //    查询单个所有
    @ResponseBody
    @RequestMapping("queryAllById")
    public String queryAllById(int pid){
        System.out.println("查询单个所有");
        person person=personDao.queryAllById(pid);
        String data = JSON.toJSONString(person);
        return data;
    }

    //    查询最大id
    @ResponseBody
    @RequestMapping("getMaxId")
    public String getMaxId(){
        System.out.println("查询最大Id");
        person maxId=personDao.getMaxId();
        String data=JSON.toJSONString(maxId);
        return data;
    }

    //    模糊查询
    @ResponseBody
    @RequestMapping("queryLike")
    public String queryLike(person person){
        System.out.println("模糊查询");
        List<person> list=personDao.queryLike(person);
        String  data = JSON.toJSONString(list);
        return data;
    }

    //    删除
    @ResponseBody
    @RequestMapping("delStudent")
    public String  delStudent(int pid){
        System.out.println("删除");
        personDao.delStudent(pid);
        return "success";
    }


    //    修改
    @ResponseBody
    @RequestMapping("update")
    public String  update(person person){
        System.out.println("修改");
        personDao.update(person);
        System.out.println(person.getPid());
        System.out.println(person.getPname());
        System.out.println(person.getPage());
        return "success";
    }

@   ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println("进来了");
        return "fzfzfzfz";
    }






}
