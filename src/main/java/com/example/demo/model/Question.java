package com.example.demo.model;


import lombok.Data;

@Data
public class Question {
    private int id;

    private String type;

    private String subject;

    private String A;

    private String B;

    private String C;

    private String D;

    private String answer;

    public Question(int id, String type, String subject, String a, String b, String c, String d, String answer) {
        this.id = id;
        this.type = type;
        this.subject = subject;
        A = a;
        B = b;
        C = c;
        D = d;
        this.answer = answer;
    }

    public Question(String type, String subject, String a, String b, String c, String d, String answer) {
        this.type = type;
        this.subject = subject;
        A = a;
        B = b;
        C = c;
        D = d;
        this.answer = answer;
    }
}
