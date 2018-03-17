package com.zking.entity;

public class tb_fu_user {
    private Integer id;

    private String user_sex;

    private String user_name;

    private String cardid;

    private String user_age;

    private String pwd;

    private String limits;

    public tb_fu_user() {
    }

    public tb_fu_user(Integer id, String user_sex, String user_name, String cardid, String user_age, String pwd, String limits) {
        this.id = id;
        this.user_sex = user_sex;
        this.user_name = user_name;
        this.cardid = cardid;
        this.user_age = user_age;
        this.pwd = pwd;
        this.limits = limits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }
}