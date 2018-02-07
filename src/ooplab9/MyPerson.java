package ooplab9;

public class MyPerson {
    public static void main(String[] args) {
Person person =new Person("359211110083",
        "sakkarin",
        new Address("758 M.2 ","NakhonSriThammarat","80240"),
        new Job("Programer",12000));
        System.out.println(person.toString());

        person.getJob().setSalary(40000);
        System.out.println("Name: "+person.getName()+"Salary: "+person.getJob().getSalary());//เป็นการเปลี่ยนค่าข้องเงิน จากเดิม 12000 เป็น 40000
    }//main
}//class