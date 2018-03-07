package com.zking.entity;

public class student {
    private Integer sid;

    private String sname;

    private String sage;

    public student(Integer sid, String sname, String sage) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }

    public student() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }
}