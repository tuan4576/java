package com.example.Array;
import java.util.ArrayList; 
public class Arraylist {
    public void Arr(){
        ArrayList<String> card = new ArrayList<>();
        card.add("Hai");
        card.add("Ba");
        card.add("Bon");
        card.add(0,"Mot");
        card.set(0,"Nam");
        card.remove(0);
        card.clear();
        // System.out.println(card);
        // System.out.println("GetIndex : " + card.get(0));
        System.out.println("Setvalue : " + card);
    }
}
