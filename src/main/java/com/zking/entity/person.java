package com.zking.entity;

public class person {
    private Integer pid;

    private String pname;

    private String page;

    private int begins;

    private int counts;


    public person(Integer pid, String pname, String page, int begins, int counts) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.begins = begins;
        this.counts = counts;
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

    public int getBegins() {
        return begins;
    }

    public void setBegins(int begins) {
        this.begins = begins;
    }

    public int getCounts() {
        return counts;
    }

    public void getCount(int counts) {
        this.counts = counts;
    }
}