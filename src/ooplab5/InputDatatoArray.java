package ooplab5;

import java.util.Scanner;

//1.user input data to array
//2.show data in array แสดงค่า user ที่ใส่เข้ามา
//3.summation data in array
//4.average value in array ค่าเฉี่ย
public class InputDatatoArray {
    private static final int MAX = 5;
    private static int number[] = new int[MAX];
    public static void main(String[] args) {

        inputdata(number,number.length);
        showData(number,number.length);
        sumData(number,number.length);
    }//main


    //sumdata
    private static void sumData(int[] number, int length) {
       double total = 0.0;
        for (int i=0;i<number.length;i++) {
            total += number[i];
        }
        System.out.print(total+"\n");
        System.out.println("The avareage data in array:"+(total/length));

    }//sumdata


    //showdata
    private static void showData(int[] number, int length) {
       System.out.print("Data in array: ");
        for (int i=0;i<length;i++){
           System.out.print(number[i]+" ");
        }
        System.out.println();
    }//showdata


    private static void inputdata(int[] number, int length) {
        // user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.print("Enter an integer["+i+"]: ");
            number[i]=scanner.nextInt();
        }

    }//inputdata

}//class
