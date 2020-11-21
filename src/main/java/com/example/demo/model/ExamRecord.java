package com.example.demo.model;


import lombok.Data;

@Data
public class ExamRecord {

    private int id;

    private int userId;

    private int examId;

    private String time;

    public ExamRecord(int id, int userId, int examId, String time) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.time = time;
    }

    public ExamRecord(int userId, int examId, String time) {
        this.userId = userId;
        this.examId = examId;
        this.time = time;
    }
}
