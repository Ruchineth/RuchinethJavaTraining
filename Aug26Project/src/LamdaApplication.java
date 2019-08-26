import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaApplication {
    public static void main(String[] args) {
        List<Student> student=Student.getStudents();
        System.out.println("Before Sort"+student);
        Comparator<Student> studentComparator=(s1,s2)->(s1.getId()<s2.getId()?-1:s1.getId()>s2.getId()?1:0);
        Collections.sort(student,studentComparator);
        System.out.println("After the Sort"+student);

    }
}
