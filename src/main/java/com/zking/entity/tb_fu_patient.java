package com.zking.entity;

public class tb_fu_patient {
    private Integer id;

    private String patient_sex;

    private String patient_name;

    private String cardid;

    private String patient_age;

    private Integer count;

    public tb_fu_patient() {
    }

    public Integer getId() {
        return id;
    }

    public tb_fu_patient(Integer id, String patient_sex, String patient_name, String cardid, String patient_age, Integer count) {
        this.id = id;
        this.patient_sex = patient_sex;
        this.patient_name = patient_name;
        this.cardid = cardid;
        this.patient_age = patient_age;
        this.count = count;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatient_sex() {
        return patient_sex;
    }

    public void setPatient_sex(String patient_sex) {
        this.patient_sex = patient_sex;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}