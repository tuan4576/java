package com.example.File;
import java.io.File;
import java.io.IOException; 

public class FileIO {
    public void Fi(){
    File MyObj = new File("text.txt");
       try {
        MyObj.createNewFile();
        System.out.println("Create file success " + MyObj.getName());
       } catch (Exception e) {
        System.out.println("error");
        e.printStackTrace();
       }
    }
}
