package com.ltp.GradeSubmission.service;

import com.ltp.GradeSubmission.Constants;
import com.ltp.GradeSubmission.Grade;
import com.ltp.GradeSubmission.repository.GradeRepository;

import java.util.List;

public class GradeService {
    GradeRepository gradeRepository = new GradeRepository();
    public Grade getGrade(int index){
        return gradeRepository.getGrade(index);
    }
    public void addGrade(Grade grade){
        gradeRepository.addGrade(grade);
    }
    public void updateGrade(Grade grade, int index){
        gradeRepository.updateGrade(grade,index);
    }
    public List<Grade> getGrades(){
        return gradeRepository.getGrades();
    }
    public int getGradeIndex(String id){
        for (int i = 0; i < getGrades().size(); i++) {
            if(getGrade(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}