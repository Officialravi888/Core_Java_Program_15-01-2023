package org.example.Chapter1;

public class Wrapperclass {
    public void Wrapper(){
        int i = 12;
        Integer obj= Integer.valueOf(i);
        System.out.println("value:"+i);
    }

    public static void main(String[] args) {
        Wrapperclass obj1=new Wrapperclass();
        obj1.Wrapper();
    }
}
