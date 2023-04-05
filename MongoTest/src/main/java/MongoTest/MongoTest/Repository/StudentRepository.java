package MongoTest.MongoTest.Repository;

import MongoTest.MongoTest.Entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
