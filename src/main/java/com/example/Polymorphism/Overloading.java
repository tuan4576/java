package com.example.Polymorphism;

public class Overloading {
    int a;
    int b;
    public Overloading(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Trave(){
        return a + b;
    }

    public int PhepCong(int a,int b){
        return a + b;
    }
    public int PhepCong(int a,int b, int c){
        return a + b + c;
    }
    public int PhepCong(int a,int b, int c ,int d){
        return a + b + c + d;
    }
    public int PhepCong(int a,int b, int c,int d, int e){
        return a + b + c + d + e;
    }
}
