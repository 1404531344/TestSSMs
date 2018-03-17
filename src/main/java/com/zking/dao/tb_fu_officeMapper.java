package com.zking.dao;

import com.zking.entity.personOutManage;
import com.zking.entity.tb_fu_office;
import com.zking.entity.tb_fu_patient;


import java.util.List;

public interface tb_fu_officeMapper {
    int deleteByPrimaryKeyOffice(Integer id);

    int insertOffice(tb_fu_office record);

   int updateByPrimaryKeyOffice(tb_fu_office record);

    public tb_fu_office queryAllByIdOffice(int id);     //根据ID查询所有

    public tb_fu_office getMaxIdOffice();                //得到最大id

    public List<tb_fu_office> queryLikeTb_fu_office(tb_fu_office tb_fu_patient);  //模糊查询

    public List<tb_fu_office> pageQueryTb_fu_office(int begin);  //分页查询

    public tb_fu_office getCountOffice();                   //得到所有数量
}