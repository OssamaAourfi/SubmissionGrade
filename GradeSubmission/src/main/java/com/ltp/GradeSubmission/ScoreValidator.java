package com.ltp.GradeSubmission;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator< Score,String> {
    List<String> scores = Arrays.asList(
            "A+","A","A-",
            "B+","B","B-",
            "C+","C","C-",
            "D+","D","D-",
            "F+","F","F-"
    );
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String string : scores) {
            if(value.equals(string)) return true;
            
        }
        return false;
    }
}
