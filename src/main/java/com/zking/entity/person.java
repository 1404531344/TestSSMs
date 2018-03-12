package com.zking.entity;

public class person {
    private Integer pid;

    private String pname;

     private String page;

    private Integer count;

    public person(Integer pid, String pname, String page, Integer count) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.count = count;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}