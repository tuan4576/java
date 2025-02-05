package com.example.Inheritance;

class Animal {
    public String name;
    public void Eat() {
        System.out.println("Con " +  name + " Đang an");
    }
    void Run(){
        System.out.println("Con " + name + " Chay");
    }
    void makeSound(){
        System.out.println("Hanh dong");
    }
}
public class Dog extends Animal {
    public void Runn(){
        super.Run();
    }
    @Override
    public void makeSound(){
        System.out.println("Dung im");
    }
    // String name;
}