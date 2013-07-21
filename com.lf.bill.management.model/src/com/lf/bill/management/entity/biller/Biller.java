package com.lf.bill.management.entity.biller;

public class Biller {
    private String id;
    private String name;
    private String desc;
    private String add;
    
    public Biller() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }
}
