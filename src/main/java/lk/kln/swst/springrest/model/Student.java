package lk.kln.swst.springrest.model;

public class Student {
    private String name;
    private String address;
    private int age;

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
