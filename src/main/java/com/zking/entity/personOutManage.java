package com.zking.entity;

public class personOutManage {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String mobile;

    private String jbname;

    private Integer bednum;

    private String principal;

    private String door;

    private String date;

    private String type;

    private String configured;

    private String stateplan;

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public personOutManage(Integer id, String name, String sex, Integer age, String mobile, String jbname, Integer bednum, String principal, String door, String date, String type, String configured, String stateplan, Integer count) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mobile = mobile;
        this.jbname = jbname;
        this.bednum = bednum;
        this.principal = principal;
        this.door = door;
        this.date = date;
        this.type = type;
        this.configured = configured;
        this.stateplan = stateplan;
        this.count = count;
    }

    public personOutManage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJbname() {
        return jbname;
    }

    public void setJbname(String jbname) {
        this.jbname = jbname;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConfigured() {
        return configured;
    }

    public void setConfigured(String configured) {
        this.configured = configured;
    }

    public String getStateplan() {
        return stateplan;
    }

    public void setStateplan(String stateplan) {
        this.stateplan = stateplan;
    }
}