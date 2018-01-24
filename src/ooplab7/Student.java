package ooplab7;
//talking about Student?
//1.student ID
//2.Name
//3.Address
//4.Gender

public class Student {
    //properties of Student ตัวเดียวกับตามที่ใครจะเรียกแอตทิบิ้ว
    public static String group = "is222";
    private String id;
    private String name;
    private String address;
    private String gender;
    //Constructor เมตตอดที่มีชื่อเดียวกับชื่อคลาสStudent
    //1.Default Constructor
    public Student(){}
    //2.Constructor by own เราสร้างขึ้นมาเอง
    public Student(String id,String n,String a,String g){
        //assign data to properties
        this.id = id; //คื่อการใส่ค่าให้ id ด้านซ้าย
        this.name = n;
        this.address = a;
        this.gender = g;
    }//Student
    //getter and setter methods


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
