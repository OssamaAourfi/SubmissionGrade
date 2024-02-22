package com.ltp.GradeSubmission.repository;

import com.ltp.GradeSubmission.Grade;

import java.util.ArrayList;
import java.util.List;

public class GradeRepository {
   private List<Grade> studentGrades = new ArrayList<>();
   public Grade getGrade(int index){
       return studentGrades.get(index);
   }
   public void addGrade(Grade grade){
       studentGrades.add(grade);
   }
   public void updateGrade(Grade grade, int index){
       studentGrades.set(index,grade);
   }
   public List<Grade> getGrades(){
       return studentGrades;
   }
}
