import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
        List<Student> student=Student.getStudents();
        System.out.println("Before the Sort"+student);
        //List<Student> students=student.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());

        List<Student> students=student.stream().sorted((s1,s2)->new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());

        System.out.println("After the Sort"+students);

        List<Student> students1=student.stream().sorted((s1,s2)->-new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList());

        System.out.println("After the Reverse Sort"+students1);
    }

}
