package com.example.Constructors;

public class ConstructorCTS {
    String name;
    int age;
    public ConstructorCTS(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Ten la " + name + " Tuoi " + age);
    }
}
