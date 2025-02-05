package com.example.Encapsulation;

class prChirld {
    protected  void pro(){
        System.out.println("protected");
    }
}

public class protectedn extends prChirld {
    public void proExt(){
        super.pro();
    }
}
