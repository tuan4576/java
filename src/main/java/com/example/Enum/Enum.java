package com.example.Enum;

public enum Enum {
    // LOW(400),
    // MEDIUM(500),
    // HIGH(600);
   
    // Enum(int price){
    //     this.price = price;
    // }
    // public int GetEnum(){
    //     return price;
    // }

    //--------
    // public void Make(){
    //     System.out.println("Chay");
    // }
    RED(30){
        @Override 
        public int action(int a , int b){
            return a + b;
        }
    },
    BLUE(50){
        @Override 
        public int action(int a , int b){
            return a - b;
        }
    };
    public abstract int action(int a , int b);
    private final int price;
    Enum(int price){
        this.price = price;
    }
    public int GetEnum(){
        return price;
    }
}
