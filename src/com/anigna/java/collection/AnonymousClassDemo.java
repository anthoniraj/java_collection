package com.anigna.java.collection;

@FunctionalInterface
interface Greeting{
    public void display();
}

@FunctionalInterface
interface Calculator{
    public int add(int a, int b);
}

public class AnonymousClassDemo{

    public static void main(String[] args) {
       Greeting greet = new Greeting() {
        @Override
        public void display() {
            System.out.println("Welcome to Lambda!");
            
        }          
       };
       greet.display();

       Greeting greetNew = ()->System.out.println("Welcome to Lambda!");
       greetNew.display();

       Calculator calc = (a, b) -> (a+b);
       System.out.println("The addition is "+calc.add(10, 20));
    }

 }
