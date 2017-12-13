package ooplab5;

import java.util.ArrayList;

public class TestArraylist {
    public static void main(String[] args) {


        //arraylist
        ArrayList list = new ArrayList();
        list.add("KIM");
        list.add("JON");
        list.add("Bird");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1, "YAYA");
        System.out.println(list);


        //print with for loop
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }//for

        System.out.println(list.indexOf("YAYA"));
        list.set(1, "KING");
        System.out.println(list);

    }//main
}//class
