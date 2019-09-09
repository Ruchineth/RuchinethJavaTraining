package RuchinethProject.springruchineth.Repository;

import RuchinethProject.springruchineth.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
}
