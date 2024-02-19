package com.ltp.GradeSubmission;

import java.util.UUID;

public class Grade {
    private String Student;
    private String Subject;
    private String Score;
    private String id;

    public Grade() {
        this.id= UUID.randomUUID().toString();
    }



    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
