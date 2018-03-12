package com.zking.dao;


import com.zking.entity.person;

import java.util.List;

/**
 * VO  dto:--->实体类
 * entity domain javabean
 */

public interface PersonDao {

    public List<person> getPersons();        //查询所有

    public person queryAllById(int pid);     //根据ID查询所有

    public person getMaxId();                //得到最大id

    public List<person> queryLike(person person);  //模糊查询

    public List<person> pageQuery(int begin);  //分页查询

    public person  getCount();                 //得到所有数量

    public void addPerson(person person);    //增加

    public void delStudent(int pid);         //删除

    public void update(person person);       //修改






}
