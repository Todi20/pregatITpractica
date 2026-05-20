package springboot.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.api.model.Student;
import springboot.api.service.StudentService;

import java.util.List;

@Controller
public class SimpleController {
    private StudentService studentService;

    public SimpleController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/all")
    public String getGetAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students_template";
    }


    @GetMapping("/students/new")
    public String addStudent(Model model) {
        Student student = new Student();
        studentService.addStudent(student);
        return "create_student";

    }

    @PostMapping("students")
    public String addStudent(@ModelAttribute("student") Student student){
        studentService.addStudent(student);
        return "redirect:/students/all";
    }

}
