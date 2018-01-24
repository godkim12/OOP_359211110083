////Ep 11.1 Lap 7
package ooplab7;

import java.util.Scanner;

public class SuperCarApp {
    public SuperCarApp() {
    }
    public static void main(String[] args) {
        SuperCar s3 = new SuperCar();
        s3 = inputData(s3);
        System.out.println(s3.toString());
    }
    private static SuperCar inputData(SuperCar s) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a SuperCar info: ");
            System.out.print("brand: ");
            s.setCarbrand(scanner.nextLine());
            System.out.print("color: ");
            s.setCarcolor(scanner.nextLine());
            System.out.print("size: ");
            s.setCarenginesize(scanner.nextLine());
            System.out.print("speed: ");
            s.setMaxspeed(scanner.nextLine());
            System.out.print("riginr: ");
            s.setCountryoforigin(scanner.nextLine());
            return s;
        }
}//class
