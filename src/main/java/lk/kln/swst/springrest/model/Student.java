package lk.kln.swst.springrest.model;

import jdk.Exported;

import javax.persistence.*;

@Entity
@Table(name="swst_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) throws IllegalArgumentException {
       if (age > 100 || age <= 0){
           throw new IllegalArgumentException("Invalid age");
       }
       this.age = age;
    }
}
