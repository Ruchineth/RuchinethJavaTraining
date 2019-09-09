package RuchinethProject.springruchineth.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    List<Telephone> telephone;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "StudentProject", joinColumns = @JoinColumn(name = "sId", referencedColumnName = "sId"), inverseJoinColumns = @JoinColumn(name = "pId", referencedColumnName = "pId"))
    List<Project> project;

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
