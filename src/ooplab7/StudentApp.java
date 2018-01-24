package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public StudentApp() {
    }

    public static void main(String[] args) {
       // create object as Student
        //1 default constructor
        Student s1 = new Student();  //สร้างออฟเจ็คของคลาส s1 เข้าถึงคลาส Sturdent
        s1.setId("001");
        s1.setName("Boy saiyai");
        s1.setAddress("109 M.2 T.Thamyai A.Thungsong");
        s1.setGender("Male");
        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println(s1.toString());
        Student s2 = new Student("002 ", "Girl Saiyai","11/11 T.Tawang A.Muang","Female");

        System.out.println(s2.toString());

        s2.setName("Girl Shngkla");
        System.out.println(s2.toString());
        //user assing data to object
        Student s3 = new Student();
        s3 = inputData(s3);
        System.out.println(s3.toString());
        System.out.println(s3.group);
        System.out.println(Student.group);
    }

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a student info: ");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setId(scanner.nextLine());
        System.out.print("Address: ");
        s.setId(scanner.nextLine());
        System.out.print("Gender: ");
        s.setId(scanner.nextLine());

        return s;
    }
}//class
