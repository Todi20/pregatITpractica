package springboot.api.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.api.model.Student;
import springboot.api.service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getGetAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }


    @PostMapping("/students/create")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student createdStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    @PutMapping("/students/update/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

//    @DeleteMapping("/students/delete/{id}")
//    public void deleteStudent(@PathVariable long id){
//        studentService.deleteStudent(id);
//    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

}
