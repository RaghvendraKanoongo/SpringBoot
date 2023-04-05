package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/")
    public String home(){
        System.out.println("hola this is raghav babaji ");
        return "This is home page!!";
    }
    @Autowired
    CourseService cs ;
    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        System.out.println("you are inside get courses ");
        return cs.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse (@PathVariable String courseId){
        return cs.getCourse(Integer.parseInt(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        System.out.println("you are inside the addCourse");
        return cs.addCourse(course);
    }
    @PutMapping("/courses")
    public List<Course> updateCourse(@RequestBody Course course){
        System.out.println("you are inside the update course");
        return cs.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public List<Course> deleteCourse(@PathVariable String courseId){
        System.out.println("you are inside deleteCourse by id");
        return cs.deleteCourse(Integer.parseInt(courseId));
    }

}
/**
 *      {
 *         "id": 1,
 *         "title": "Maths",
 *         "description": "ganit ki dikkat"
 *     },
 *     {
 *         "id": 2,
 *         "title": "English",
 *         "description": "angreji beat de"
 *     },
 *     {
 *         "id": 3,
 *         "title": "Hindi",
 *         "description": "rashtra bhasha"
 *     },
 *     {
 *         "id": 4,
 *         "title": "Science",
 *         "description": "Science padhlo friends"
 *     }
 */
