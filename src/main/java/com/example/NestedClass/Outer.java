package com.example.NestedClass;

public class Outer {
    public static class Nested{
        public void display(){
            System.out.println("Lop tinh");
        }
    }
    private String message = "Hello from Outer class";
    public class Nested1{
        public void display1(){
            System.out.println(message);
        }
    }
    
}
 