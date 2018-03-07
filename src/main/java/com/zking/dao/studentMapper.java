package com.zking.dao;


import com.zking.entity.student;

import java.util.List;

public interface studentMapper {

    public List<student> getStudent();


    int deleteByPrimaryKey(Integer sid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}