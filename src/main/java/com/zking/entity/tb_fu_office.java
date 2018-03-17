package com.zking.entity;

public class tb_fu_office {
    private Integer id;

    private String office_name;

    private Integer count;

    public tb_fu_office() {
    }

    public tb_fu_office(Integer id, String office_name, Integer count) {
        this.id = id;
        this.office_name = office_name;
        this.count = count;
    }

    public String getOffice_name() {

        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}