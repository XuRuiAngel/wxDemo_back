package com.example.demo.model;


import lombok.Data;

@Data
public class User {

    private int id;

    private String openid;

    private String school;

    private String academy;

    private String classes;

    private String name;

    private String studentId;

    public User(String openid, String school, String academy, String classes, String name, String studentId) {
        this.openid = openid;
        this.school = school;
        this.academy = academy;
        this.classes = classes;
        this.name = name;
        this.studentId = studentId;
    }

    public User(int id, String openid, String school, String academy, String classes, String name, String studentId) {
        this.id = id;
        this.openid = openid;
        this.school = school;
        this.academy = academy;
        this.classes = classes;
        this.name = name;
        this.studentId = studentId;
    }
}
