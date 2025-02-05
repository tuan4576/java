package com.example;
import java.util.Scanner;

import com.example.Constructors.ConstructorCTS;
import com.example.Constructors.ConstructorKTS;
import com.example.Encapsulation.privaten;
import com.example.Encapsulation.protectedn;
import com.example.Encapsulation.publicn;
public class Main {
  public static void main(String[] args) {
    int cv;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Nhap lua chon cua ban");
      cv = scanner.nextInt();
      switch (cv) {
        case 1:
        publicn pu1 = new publicn();
        pu1.pu();
        break;
        case 2:
        privaten pr1 = new privaten();
        pr1.prchirld();
        break;
        case 3:
        protectedn pro1 = new protectedn();
        pro1.proExt();
        break;
        case 4:
        ConstructorKTS conkts = new ConstructorKTS();
        System.out.println("Gia tri : " + conkts.name);
        break;
        case 5: 
        ConstructorCTS concts = new ConstructorCTS("tuan",20);
        concts.display();
        break;
        default:
          System.out.println("Lua chon cua ban khong co trong nay");
          break;
      }
    } while (cv != 0);
    scanner.close();
    System.out.println("Chuong trinh ket thuc");
  }
}