package com.example.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public void Nu(){
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(50);
        Arr.add(30);
        Arr.add(10);
        System.out.println("Chuoi hien tai : " + Arr);
        Collections.sort(Arr);
        System.out.println("Chuoi sau khi da xap xep : " + Arr);
    }
    public void Rnu(){
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(50);
        Arr.add(30);
        Arr.add(10);
        System.out.println("Chuoi hien tai : " + Arr);
        Collections.sort(Arr);
        System.out.println("Chuoi sau khi da xap xep : " + Arr);
    }
    public void St(){
        ArrayList<String> Arr = new ArrayList<>();
        Arr.add("Mot");
        Arr.add("Hai");
        Arr.add("Ba");
        System.out.println("Chuoi hien tai : " + Arr);
        Collections.sort(Arr);
        System.out.println("Chuoi sau khi da xap xep : " + Arr);
    }
    public void Rst(){
        ArrayList<String> Arr = new ArrayList<>();
        Arr.add("Mot");
        Arr.add("Hai");
        Arr.add("Ba");
        System.out.println("Chuoi hien tai : " + Arr);
        System.out.println("Chuoi sau khi dao nguoc : ");
        Collections.sort(Arr, Collections.reverseOrder()); 
    }
}
