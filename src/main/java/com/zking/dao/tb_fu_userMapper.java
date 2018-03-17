package com.zking.dao;

import com.zking.entity.tb_fu_user;

import java.util.List;

public interface tb_fu_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tb_fu_user record);

    int insertSelective(tb_fu_user record);

    tb_fu_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tb_fu_user record);

    int updateByPrimaryKey(tb_fu_user record);

    tb_fu_user getTb_fu_userByName(tb_fu_user  tb_fu_user);
}