package ada;

import java.util.Scanner;

public class Hello {
    public static void main (String [] args){
        Mathop m= new Mathop();
        m.sum(2.5f,3.5f);
       
    }
}
class Mathop{
    void sum (int a, int b){
        System.out.println(a+b);
    }
    void sum(float a, float b){
        System.out.println(a+b);
    }
}
