package com.example.Abstract;
interface Animal1{
    public void Make();
}
interface Animal2{
    public void Makee();
}
public class Interface implements Animal1, Animal2 {
    @Override
    public void Make(){
        System.out.println("Hanh dong mot");
    }
    public void Makee(){
        System.out.println("Hanh dong hai");
    }
}
