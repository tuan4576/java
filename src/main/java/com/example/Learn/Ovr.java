package com.example.Learn;

class Animal{
    void makeSound(){
        System.out.println("Hanh dong chung");
    }
} 
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Hanh dong cua cho");
    }
}
class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("Hanh dong cua meo");
    }
}
public class Ovr {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myAnimal.makeSound();
        myDog.makeSound(); 
        myCat.makeSound(); 
        Object obj;
        obj = "Hello, World!"; // Kiểu String
        System.out.println(obj); // In ra: Hello, World!
        obj = 123; // Kiểu Integer
        System.out.println(obj); // In ra: 123
        obj = new Do(); // Đối tượng Dog
        System.out.println(obj); // In ra: Dog@hashcode
    }
}
class Do {
    @Override
    public String toString() {
        return "La mot con cho";
    }
}