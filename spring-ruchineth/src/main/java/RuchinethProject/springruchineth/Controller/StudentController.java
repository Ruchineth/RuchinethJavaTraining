package RuchinethProject.springruchineth.Controller;

import RuchinethProject.springruchineth.Entity.Address;
import RuchinethProject.springruchineth.Entity.Student;
import RuchinethProject.springruchineth.Entity.Telephone;
import RuchinethProject.springruchineth.Service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/Ruchineth")
public class StudentController {
    @Autowired
    StudentServiceImp studentService;
    /*@RequestMapping(value = "/Hello",method = RequestMethod.GET)
    //@RequestMapping(value = "/Hello")
    public String greeting(){
        return "Hello";
    }*/

   @RequestMapping(value ="/Student",method = RequestMethod.GET)
    public Student getStudent(){
        Student st1=new Student();
        st1.setName("Ruchineth");
        Address ad1=new Address();
        ad1.setCity("Kurunegala");
        st1.setAddress(ad1);
        List<Telephone> tel=new ArrayList<>();
        Telephone tl1=new Telephone();
        tl1.setTelephoneNo("0715803639");
        tel.add(tl1);
        tl1.setStudent(st1);
        st1.setTelephone(tel);
        return st1;

    }

    @RequestMapping(value = "/Student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }
    @RequestMapping(value = "/All",method = RequestMethod.GET)
    public List<Student> getAllStudent(){
       return studentService.getAll();
    }

    @RequestMapping(value = "/All/{id}",method = RequestMethod.GET)
    public Optional<Student> getStudentById(@PathVariable Integer id){
       return studentService.getStudentById(id);
    }

}