package ooplab9;
// เป้นออฟเจ็คที่ใช้ร่วมกันก้คือ Car and Engine Engine เป็นส่วนหนึ่งของ Car ที่มาคร่วมกัน
public class myCarAapp {
    public static void main(String[] args) {
    Engine engine = new Engine("1500 CC",
            "V-TEC V4");
    Car car = new Car("Honda","black",
            "City",engine);
    System.out.println(car.toString());

    Car car1 =new Car("Toyota","Red","Altis",engine);
    System.out.println(car1.toString());

    }//main
}//class
