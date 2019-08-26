import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        printStudentwithShortNames();
        filterTheStudent();
        process();
        getStudentCount();
        getStudentMaximumId();
        getStudentMinimumId();

    }

    static void printStudentwithShortNames(){
        List<Student> students=Student.getStudents();
        for (Student student:students){
            if (student.getName().length()<=6){
                System.out.println(student.getName());
            }
        }

    }
    public static void filterTheStudent(){
        List<Student> students=Student.getStudents().stream().filter(s->s.getName().length()<=6).collect(Collectors.toList());
        System.out.println(students);
    }
    public static void process(){
        List<Student> student=Student.getStudents().stream().map(s->new Student("Dr "+s.getName(),s.getId())).collect(Collectors.toList());
        System.out.println(student);
        Student.getStudents().stream().map(s->new Student("Dr "+s.getName(),s.getId())).collect(Collectors.toList()).forEach(s-> System.out.println(s));
    }
    public static void getStudentCount(){
        long studentCount=Student.getStudents().stream().count();
        System.out.println("Student count:"+studentCount);
    }
    public static void getStudentMaximumId(){
        Student maxIdStudent = Student.getStudents().stream().max(Comparator.comparing(s->s.getId())).get();
        System.out.println("Maximum id student name is:"+maxIdStudent.getName());
    }
    public static void getStudentMinimumId(){
        Student minIdStudent = Student.getStudents().stream().min(Comparator.comparing(s->s.getId())).get();
        System.out.println("Minimum id student name is:"+minIdStudent.getName());
    }
}