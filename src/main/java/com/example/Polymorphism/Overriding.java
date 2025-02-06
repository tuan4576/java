package com.example.Polymorphism;
class Parent{
    public void Make(){
        System.out.println("Lop cha");
    }
}
public class Overriding extends Parent {
    @Override
    public void Make(){
        System.out.println("Lop con");
    }   
}
