package ooplab6;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
        String s = "Welcome to RMUTSV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        System.out.println(tokenizer.countTokens()); //การนับคำ
        //count word in String
        System.out.println(tokenizer.countTokens());
        //cut word in string การตัดคำออกมาดูทีละคำ
        //reverse word in string การรีเวิร์ดทีละคำ ๆ ไป
        while (tokenizer.hasMoreTokens()) {
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }
    }//main
}//calss
