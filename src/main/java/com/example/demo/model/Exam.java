package com.example.demo.model;


import lombok.Data;

@Data
public class Exam {
    private int id;

    private String name;

    private String type;

    public Exam(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Exam(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
