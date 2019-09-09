package RuchinethProject.springruchineth.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tId;
    private String telephoneNo;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne(cascade = CascadeType.ALL)@JoinColumn @JsonIgnore
    Student student;
}
