package com.example;
import java.util.Scanner;

import com.example.Encapsulation.privaten;
import com.example.Encapsulation.protectedn;
import com.example.Encapsulation.publicn;
public class Main {
  public static void main(String[] args) {
    int cv;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Nhập lựa chọn của bạn");
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
        default:
          System.out.println("Lựa chọn của bạn không có trong này");
          break;
      }
    } while (cv != 0);
    scanner.close();
    System.out.println("Chương trình kết thúc");
  }
}