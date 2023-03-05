package com.example.regimen;

import java.util.Date;

public class Item {
    private String name;
    private String group;
    private String date;

    public Item(String name, String group, String date) {
        this.name = name;
        this.group = group;
        this.date = date; //fix
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
