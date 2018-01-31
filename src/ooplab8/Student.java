package ooplab8;

import java.util.Date;
//Student si Person
//Student is sub-class of person class
//Person is super-class

public class Student extends Person {
    private String id;
    private String program;
    public Student(String name, String gender, String dateOfBirth, int age, String id, String program) {
        super(name, gender, dateOfBirth, age);
        this.id = id;
        this.program = program;
    }
    //toString() เจนโค้ด Alt+insert+toString  เลือกที่ String toString+ super.toString
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }


    //getter and setter method
    public void setId(String id) {
        this.id = id;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getId() {
        return id;
    }

    public String getProgram() {
        return program;
    }

}//calss
