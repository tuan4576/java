package com.example.Abstract;

abstract class Animal{
    abstract void Make();
    public void Makee(){
        System.out.println("Makee");
    }
}

public class AbstractClass extends Animal {
    @Override
    public void Make() {
        System.out.println("Make");
    }   
}
