package com.example;
import java.util.Scanner;

import com.example.Constructors.ConstructorCTS;
import com.example.Constructors.ConstructorKTS;
import com.example.Date.LocalDatee;
import com.example.Encapsulation.privaten;
import com.example.Encapsulation.protectedn;
import com.example.Encapsulation.publicn;
import com.example.Enum.Enum;
import com.example.Inheritance.Dog;
import com.example.NestedClass.Outer;
import com.example.Polymorphism.Overloading;
import com.example.Polymorphism.Overriding;
import com.example.Static.StaticVariable;
import com.example.Abstract.AbstractClass;
import com.example.Abstract.Interface;
public class Main {
  static void Create(){
    Enum myVar = Enum.BLUE;
  System.out.println("Ket qua la : " + myVar.GetEnum());
  }
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
        case 6:
        Dog dog = new Dog();
        dog.name = "cho";
        dog.Eat();
        dog.Runn();
        dog.makeSound();
        break;
        case 7:
        Overloading ovr =  new Overloading(5,5);
        int Construc = ovr.Trave();
        int kq1 = ovr.PhepCong(5,6);
        int kq2 = ovr.PhepCong(5,6,7);
        int kq3 = ovr.PhepCong(5,6,7,8);
        int kq4 = ovr.PhepCong(5,6,7,8,9);
        System.out.println("Ket qua Constructor la : " + Construc);
        System.out.println("Ket qua Hai chu so la : " + kq1);
        System.out.println("Ket qua Ba chu so la : " + kq2);
        System.out.println("Ket qua Bon chu so la : " + kq3);
        System.out.println("Ket qua Nam chu so la : " + kq4);
        break;
        case 8:
        Overriding ove = new Overriding();
        ove.Make();
        break;
        case 9:
        Outer.Nested Ou = new Outer.Nested(); 
        Ou.display();
        break;
        case 10:
        StaticVariable StcV02 = new StaticVariable();
        StaticVariable StcV01 = new StaticVariable();
        StcV01.SetVariable(10);
        System.out.println("Giá trị của Lop  là : " +  StaticVariable.SoNguyen);
        System.out.println("Giá trị của đối tượng một là : " +  StcV01.SoNguyen);
        System.out.println("Giá trị của đối tượng hai là : " +  StcV02.SoNguyen);
        StcV01.showCount();
        break;
        case 11:
        // StaticVariable StcMt = new StaticVariable();
        // int result = StcMt.StaticMethod(5);
        System.out.println("Ket qua la : " + StaticVariable.StaticMethod(5));
        break;
        case 12:
        AbstractClass abs = new AbstractClass();
        abs.Make();
        abs.Makee();
        break;
        case 13:
        Interface inter = new Interface();
        inter.Make();
        inter.Makee();
        break;
        case 14:
        // Enum myVar = Enum.MEDIUM;
        // System.out.println("Ket qua la : " + myVar.GetEnum());
        //--------------------
        // Enum myVar = Enum.RED;
        // System.out.println("Ket qua la : " + myVar.action(2, 6));
        //---------------------
        Create();
        break;
        case 15:
        LocalDatee n = new LocalDatee();
        n.Date();
        n.Time();
        n.FormatDateTime();
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