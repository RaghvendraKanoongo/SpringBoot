package MongoTest.MongoTest.Controller;

import MongoTest.MongoTest.Entities.Student;
import MongoTest.MongoTest.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class MyController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        System.out.println("inside addStudent() method");
        return this.studentRepository.save(student);
    }

    @GetMapping("/")
    public List<Student> getAll(){
        return this.studentRepository.findAll();
    }
}


















