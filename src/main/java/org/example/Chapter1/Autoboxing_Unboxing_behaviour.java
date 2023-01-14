package org.example.Chapter1;

public class Autoboxing_Unboxing_behaviour {
    public static void main(String[] args) {
        int i=12;
        Integer j=i;    //Autoboxing

        Integer k=13;
        int m=k;   //Unboxing
        System.out.println("print:"+i);
        System.out.println("value of j(Wrapper-Autoboxing):"+j);
        System.out.println("value of j(Wrapper-Unboxing):"+k);
    }
}
