package com.zking.dao;

import com.zking.entity.person;
import com.zking.entity.tb_fu_patient;

import java.util.List;

public interface tb_fu_patientMapper {

    public List<tb_fu_patient> getTb_fu_patient();        //查询所有

    public tb_fu_patient queryAllByTb_fu_patientId(int id);     //根据ID查询所有

    public tb_fu_patient getTb_fu_patientMaxId();                //得到最大id

    public List<tb_fu_patient> queryLikeTb_fu_patient(tb_fu_patient tb_fu_patient);  //模糊查询

    public List<tb_fu_patient> pageQueryTb_fu_patient(int begin);  //分页查询

    public tb_fu_patient getCountTb_fu_patient();                 //得到所有数量

    int addTb_fu_patient(tb_fu_patient tb_fu_patient);    //增加

    public void delTb_fu_patient(int id);         //删除

    public void updateTb_fu_patient(tb_fu_patient tb_fu_patient);       //修改

}