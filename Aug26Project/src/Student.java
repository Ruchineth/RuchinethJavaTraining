import java.util.ArrayList;
import java.util.List;
public class Student {




        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(String name, int id){
            this.name=name;
            this.id=id;
        }

        public static List<Student> getStudents(){
            List<Student> student=new ArrayList<>();
            student.add(new Student("Krish",1));
            student.add(new Student("Ruchineth",24));
            student.add(new Student("Manitha",11));
            student.add(new Student("Wasanatha",23));
            student.add(new Student("Mahinda",16));
            student.add(new Student("Sana",32));
            return student;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

