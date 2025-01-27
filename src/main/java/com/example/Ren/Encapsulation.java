package com.example.Ren;
// import com.example.Rieng.rieng;


class rieng {
    protected void Lopcao(){
        System.out.println("Lớp cao");
    }
}

 class InnerEncapsulation extends rieng {
    public void Lopcao(){
        super.Lopcao();
    }
    protected void Lopcha(){
        System.out.println("Lớp cha");
    }
}

public class Encapsulation extends InnerEncapsulation {
    private String name; 
    public void animal(){
        System.out.println("public");
    }
    @Override
    public void Lopcha(){
        super.Lopcha();
        // System.out.println("Lớp con");
    }
    public String getter(){
        return name;
    }
    public void setter(String name){
        this.name = name;
    }
}
