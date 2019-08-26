import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Student> student=Student.getStudents();
        System.out.println("Before Sort"+student);
        Collections.sort(student,new CompareStudent());

        System.out.println("After Sort"+student);

    }
}
