package com.springrest.springrest.services;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }
    @Override
    public Course getCourse(int courseId) {
//        System.out.println("you are in here in getById");
//        Course temp =
//        System.out.println("we recieved it ------------------------------");
//        System.out.println(temp.getTitle());
        return courseDao.findById(courseId).orElse(null);
    }
    @Override
    public Course addCourse(Course newCourse) {
        courseDao.save(newCourse);
        return newCourse;
    }
    @Override
    public List<Course> updateCourse(Course currentCourse) {
        courseDao.save(currentCourse);
        return courseDao.findAll();
    }
    @Override
    public List<Course> deleteCourse(int courseID) {
         courseDao.deleteById(courseID);
         return courseDao.findAll();
    }
}