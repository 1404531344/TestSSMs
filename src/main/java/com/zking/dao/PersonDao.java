package com.zking.dao;


import com.zking.entity.person;

import java.util.List;

/**
 * VO  dto:--->实体类
 * entity domain javabean
 */

public interface PersonDao {
    public List<person> getPersons();
    public person queryAllById(int pid);
    public void addPerson(person person);
    public void delStudent(int pid);
    public void update(person person);
    public person getMaxId();
    public List<person> queryLike(person person);




}
