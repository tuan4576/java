package com.example.Static;

public class StaticVariable {
    public static int SoNguyen = 0;
    static int count =  0;
    public void SetVariable(int songuyen){
        SoNguyen = songuyen;
    }
    public StaticVariable(){
        count++;
    }
    public void showCount(){ 
        System.out.println("Count : " + count);
    }
    public static int StaticMethod(int x){
        return x * x;
    }
    static {
        System.out.println("helo");
    }
}
