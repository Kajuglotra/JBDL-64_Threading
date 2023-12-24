package org.gfg.streaming;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        Calculator c2 = (a, b) -> a+b;

        Calculator c1 = (a, b) -> {
            System.out.println("i am in llamda exp");
            return  a+b;
        };
        System.out.println(c2.add(2,3));



        // CustomClass.getValue() -> () -> function
//        CustomClass.val -> variable
        System.out.println(calculator.add(2,3));
    }
}
