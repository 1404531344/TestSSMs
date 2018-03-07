package com.zking.entity;

public class person {
    private Integer pid;

    private String pname;

    private String page;



    public person(Integer pid, String pname, String page) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
    }

    public person() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}