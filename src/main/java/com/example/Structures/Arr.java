package com.example.Structures;
import java.util.ArrayList;

public class Arr {
    public void Ar(){
        ArrayList<Number> array = new ArrayList<>();
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        for (Number so : array) {
            System.out.print( so + ", ");
        }
    }
}
