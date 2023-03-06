package com.example.regimen;

public class Page {
    private String title;
    private String body;
    private Group group;

    public Page(String title, String body, Group group) {
        this.title = title;
        this.body = body;
        this.group = group;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
