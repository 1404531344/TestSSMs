package com.zking.controller;

//import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSON;
import com.zking.dao.personOutManageMapper;
import com.zking.entity.person;
import com.zking.entity.personOutManage;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class personOutManageController {


    @Autowired
    personOutManageMapper personOutManageMapper;





//    分页查询
@ResponseBody
@RequestMapping("pageQueryPersonOutManage")
public List<personOutManage> pageQueryPersonOutManage(int begin){
    List<personOutManage> list=personOutManageMapper.pageQueryPersonOutManage(begin);
    return list;
}

//模糊查询

    @ResponseBody
    @RequestMapping("queryLikePersonOutManage")
    public List<personOutManage> queryLikePersonOutManage(personOutManage personOutManage){
        List<personOutManage> list=personOutManageMapper.queryLikePersonOutManage(personOutManage);
        return list;
    }

    //    查询所有数量
    @ResponseBody
    @RequestMapping("getPersonOutManageCount")
    public String getPersonOutManageCount(){
        System.out.println("查询所有数量");
        personOutManage count=personOutManageMapper.getPersonOutManageCount();
        String data=count.getCount().toString();
        return data;
    }

    //    查询最大id
    @ResponseBody
    @RequestMapping("getPersonOutManageMaxId")
    public String getPersonOutManageMaxId(){
        personOutManage maxId=personOutManageMapper.getPersonOutManageMaxId();
        String data=JSON.toJSONString(maxId);
        return data;
    }

    //    查询单个所有
    @ResponseBody
    @RequestMapping("queryPersonOutManageById")
    public personOutManage queryPersonOutManageById(int id){
        personOutManage person=personOutManageMapper.queryPersonOutManageById(id);
        return person;
    }



    //增加
    @ResponseBody
    @RequestMapping("addPersonOutManage")
    public String addPerson(personOutManage personOutManage){
        personOutManageMapper.insert(personOutManage);
        return "success";
    }

    //    删除
    @ResponseBody
    @RequestMapping("delPersonOutManage")
    public String  delPersonOutManage(int id){
        personOutManageMapper.deleteByPrimaryKey(id);
        return "success";
    }


    //    修改
    @ResponseBody
    @RequestMapping("updatePersonOutManage")
    public String  updatePersonOutManage(personOutManage personOutManage){
        personOutManageMapper.updateByPrimaryKey(personOutManage);
        return "success";
    }




}
