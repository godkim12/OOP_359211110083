package ooplab3;

import java.util.Scanner;

public class TestDOWhileLoop {
    public static void main(String[] args) {
        int n = 1;

        do {
                    //statement
            System.out.print(n+" ");

        } while (++n <= 10);
        //coorect pasword
        int pin = 1234;
        int count = 0;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your password");
            int inpuut = scanner.nextInt();
            count++;
            if (inpuut == pin) {
                System.out.println("Your password is correct.");
                break;
            }
            if (count == 3) {
                System.out.println("System Error");
                break;
            }

        } while (input != pin);


    }//main
}//class
