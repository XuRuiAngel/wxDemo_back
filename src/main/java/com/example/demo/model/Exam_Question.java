package com.example.demo.model;

import lombok.Data;

@Data
public class Exam_Question {
    private int id;

    private int examId;

    private int questionId;

    private double score;

    private int responseNum;

    private int correctNum;

    public Exam_Question(int id, int examId, int questionId, double score,int responseNum,int correctNum) {
        this.id = id;
        this.examId = examId;
        this.questionId = questionId;
        this.score = score;
        this.responseNum=responseNum;
        this.correctNum=correctNum;
    }

    public Exam_Question(int examId, int questionId, double score,int responseNum,int correctNum) {
        this.examId = examId;
        this.questionId = questionId;
        this.score = score;
        this.responseNum=responseNum;
        this.correctNum=correctNum;
    }
}
