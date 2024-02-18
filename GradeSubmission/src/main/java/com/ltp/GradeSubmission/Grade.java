package com.ltp.GradeSubmission;

public class Grade {
    private String Student;
    private String Subject;
    private String Score;

    public Grade() {
    }

    public Grade(String student, String subject, String score) {
        Student = student;
        Subject = subject;
        Score = score;
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

}
