package RuchinethProject.springruchineth.Service;

import RuchinethProject.springruchineth.Entity.Student;
import RuchinethProject.springruchineth.Entity.Telephone;
import RuchinethProject.springruchineth.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp {
    @Autowired
    StudentRepository studentRepository;
    public Student save(Student student){
        for(Telephone tel:student.getTelephone()){
            tel.setStudent(student);
        }

        return studentRepository.save(student);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Integer id){
        return studentRepository.findById(id);
    }



}
