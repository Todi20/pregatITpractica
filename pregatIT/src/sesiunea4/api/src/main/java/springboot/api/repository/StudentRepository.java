package springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
