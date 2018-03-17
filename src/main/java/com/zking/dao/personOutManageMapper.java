package com.zking.dao;

import com.zking.entity.person;
import com.zking.entity.personOutManage;

import java.util.List;

public interface personOutManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(personOutManage record);

    int insertSelective(personOutManage record);

    int updateByPrimaryKeySelective(personOutManage record);

    int updateByPrimaryKey(personOutManage record);

    List<personOutManage> getPersonManage();

    List<personOutManage> pageQueryPersonOutManage(int begin);

    List<personOutManage> queryLikePersonOutManage(personOutManage personOutManage);

    personOutManage getPersonOutManageCount();                 //得到所有数量

    personOutManage getPersonOutManageMaxId();                //得到最大id

    personOutManage queryPersonOutManageById(int pid);     //根据ID查询所有
}