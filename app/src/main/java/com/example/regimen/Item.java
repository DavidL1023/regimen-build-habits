package com.example.regimen;

import java.util.Date;

public class Item {
    private String name;
    private Group group;
    private String date;
    private String note;

    public Item(String name, Group group, String date) {
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
