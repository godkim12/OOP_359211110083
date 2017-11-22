package ooplab2;

import java.awt.*;

public class TestVariable {
    public static void main(String[] args) {
        // Integer
      int i;
      i = 10;
      System.out.println("i ="+i);
      int j = 20;
      System.out.println("i+j="+j);
      System.out.println("i+j="+(i+j));
      System.out.println("i*j="+(i*j));
      System.out.println("i/j="+(i/j));

// Double
        double v = 50.5;
        System.out.println("v = "+v);

        i = (int) v;
        System.out.println(i);
        System.out.println(v);

        // charector
        char c ='X';
        System.out.println(c);

        //String
      String S = "Hello, world";
       System.out.println(S);
      String name = "I'm kim";
      System.out.println(S+" "+name);
      String msg = S.concat(" "+name);
      System.out.println(msg);
      System.out.println(msg.toUpperCase());
      System.out.println(msg.toLowerCase());
      System.out.println(msg.length());
      System.out.println(msg.replace('o', 'g'));

      //Bolean
      boolean b = true;
      boolean b1 = false;
      System.out.println(b + " " + b1);

      //Shortcut Operator
      int number = 10;
      System.out.println(number);
      number += 1; //number = number+1;
      number = -5; //number= number-5;
      int x= number++;

      String n = "20.20";
      //int age = Integer.parseInt(n);
      double age = Double.parseDouble(n);
      System.out.println(age);


    }//main
}//class
