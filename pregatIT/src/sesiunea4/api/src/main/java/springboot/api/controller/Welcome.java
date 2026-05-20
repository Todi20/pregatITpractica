package springboot.api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.api.model.Student;

@RestController
public class Welcome {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to your first Spring Boot Application";
    }

    @GetMapping("/homepage")
    public String homePage() {
        return "This is the HomePag. Welcome!";
    }


}