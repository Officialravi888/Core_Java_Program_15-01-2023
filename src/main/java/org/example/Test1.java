package org.example;

public class Test1 {
    public void run(){
        System.out.println("hay1");
    }
    class test2 extends Test1{
        public void run(){
            System.out.println("welcome");
            super.run();
        }

    }

    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.run();
    }

}
