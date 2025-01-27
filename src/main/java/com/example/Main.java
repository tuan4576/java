package com.example;

import java.util.Scanner;

import com.example.Ren.Encapsulation;

public class Main {
  private void animal1() {
    System.out.println("private");
  }

  public static void main(String[] args) {
    int cv;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Nhập lựa chọn của bạn");
      cv = scanner.nextInt();
      switch (cv) {
        case 1:
          Encapsulation pub = new Encapsulation();
          pub.animal();
          break;
        case 2:
          Main pri = new Main();
          pri.animal1();
          break;
        case 3:
          Encapsulation p = new Encapsulation();
          p.Lopcha();
          break;
        case 4:
          Encapsulation lopcao = new Encapsulation();
          lopcao.Lopcao();
          break;
        case 5:
          Encapsulation lopcaoo = new Encapsulation();
          System.out.println("Nhập tên");
          String x = scanner.next();
          lopcaoo.setter(x);
          System.out.println("Vậy tên của bạn là : " + lopcaoo.getter());
          break;
        default:
          System.out.println("Lựa chọn của bạn không có trong này");
          break;
      }
    } while (cv != 0);
    scanner.close();
    System.out.println("Chương trình kết thúc");
  }
}