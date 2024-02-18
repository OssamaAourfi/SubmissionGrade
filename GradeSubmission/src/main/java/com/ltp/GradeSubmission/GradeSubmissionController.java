package com.ltp.GradeSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GradeSubmissionController {

    List<Grade> studentGrades = new ArrayList<>();
    @GetMapping("/")
    public String gradeForm(Model model , @RequestParam(required = false) String name){
        System.out.println(name);
        model.addAttribute("grade",new Grade());
        return "form";
    }
    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade){

        studentGrades.add(grade);
        return "redirect:/grades";
    }
    @GetMapping("/grades")
    public String getGrades(Model model){

        model.addAttribute("grades",studentGrades);
        return "grades";
    }
}
