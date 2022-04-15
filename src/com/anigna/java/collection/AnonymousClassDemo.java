package com.anigna.java.collection;
/**
 * Anonymous Inner Class and Lambda Demo
 * @author: Anthoniraj Amalanathan
 * @since 16-Apr-2022
 */

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
       /* Anonymous Inner Class in Java */
       Greeting greeting = new Greeting() {
            @Override
            public void display() {
                System.out.println("Welcome to Java!");
            }           
       };

       greeting.display();

       /* Lambda Expression for replacing Annonymous Inner Class */
       Greeting greet = ()->System.out.println("Welcome to Java!");
       greet.display();

       /* Lambda Expression with Params */
       Calculator calc = (a,b)->(a+b);
       System.out.println(calc.add(10, 20)); 

       /* Creating Thread - Conventional Way */
       Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread-1");
            }  
       });
       t.start();
       
       /* Lambda Expression for Predefined Functional Interface */
       Thread th = new Thread(()->System.out.println("New Thread-2"));
       th.start();


    }
 }
