package com.zking.controller;

import com.zking.dao.tb_fu_userMapper;
import com.zking.entity.tb_fu_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Tb_fu_userController {
    @Autowired
    tb_fu_userMapper tb_fu_userMapper;


//根据name 查询pwd(登录)
//    @ResponseBody
    @RequestMapping("getTb_fu_userByName")
    public String getTb_fu_userByName(tb_fu_user tb_fu_user){
        tb_fu_user tb_fu_user1=tb_fu_userMapper.getTb_fu_userByName(tb_fu_user);
        String pwd=tb_fu_user1.getPwd();
         if(tb_fu_user.getPwd().equals(pwd)){
             return "index";
         }else {
             return "";
         }
    }


}
