package com.example;
import java.util.Scanner;

import com.example.Ren.ConCho;
public class Main {
  public static void main(String[] args) {
    int cv;
    Scanner scanner = new Scanner(System.in);
      do {
        System.out.println("Nhập lựa chọn của bạn");
        System.out.println("Nhập lựa chọn của bạn");
        cv = scanner.nextInt();
        switch (cv) {
          case 1:
            System.out.println("hello nè");
            break;
        
          default:
            System.out.println("Cút");
            break;
        }
      } while (cv != 0);
      scanner.close();
      System.out.println("Chương trình kết thúc :"); 
    }
} 