package com.example.Student.Model;

import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Integer>{

}
// Insert into student values(101,"Raghav");