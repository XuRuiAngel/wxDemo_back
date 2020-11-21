package com.example.demo.model;

import lombok.Data;

@Data
public class Exam_Question {
    private int id;

    private int examId;

    private int questionId;

    private double score;

    public Exam_Question(int id, int examId, int questionId, double score) {
        this.id = id;
        this.examId = examId;
        this.questionId = questionId;
        this.score = score;
    }

    public Exam_Question(int examId, int questionId, double score) {
        this.examId = examId;
        this.questionId = questionId;
        this.score = score;
    }
}
