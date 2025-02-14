package com.example.File;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
import java.io.FileWriter;

public class FileIO {
    public void Fi(){
        File MyObj = new File("text.txt");
        int cc;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Nhap lua chon cua ban");
            System.out.println("1. Tao file");
            System.out.println("2. Ghi file");
            System.out.println("3. Xoa file");
            System.out.println("4. Kiem tra co the ghi file");
            System.out.println("5. Kiem tra co the doc file");
            System.out.println("6. Kiem tra file da ton tai");
            System.out.println("7. Xem duong dan cua file");
            System.out.println("8. Xem kich thuoc cua file");
            System.out.println("10. Lam viec voi thuc muc ");
            cc = scanner.nextInt();
            switch (cc) {
            case 1:
                try {
                    MyObj.createNewFile();
                    System.out.println("Tao file thanh cong " + MyObj.getName());
                    } catch (Exception e) {
                    System.out.println("Loi");
                    e.printStackTrace();
                }
            break;
            case 2:
                try {
                    FileWriter wr = new FileWriter("text.txt");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap van ban vao : ");
                    wr.write(sc.nextLine());
                    wr.flush();  // Đảm bảo dữ liệu được ghi vào file
                    wr.close();  // Đóng file để lưu lại nội dung
                    System.out.println("Ghi thanh cong " + MyObj.getName());
                } catch (Exception e) {
                    System.out.println("Loi");
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    MyObj.delete();
                    System.out.println("Xoa file thanh cong" + MyObj.getName());
                    } catch (Exception e) {
                    System.out.println("Loi");
                    e.printStackTrace();
                    }
            break;
            case 4:
            try {
                MyObj.canWrite();
                System.out.println("Co the ghi vao file ");
            } catch (Exception e) {
                System.out.println("Loi khong the ghi file");
               e.printStackTrace();
            }
            break;
            case 5:
            try {
                MyObj.canRead();
                System.out.println("Co the doc vao file ");
            } catch (Exception e) {
                System.out.println("Loi khong the doc file");
               e.printStackTrace();
            }
            break;
            case 6:
            if(MyObj.exists()){
                System.out.println("File tao da ton tai");
            } else {
                System.out.println("File khong ton tai");   
            }
            break;
            case 7:
            if(MyObj.exists()){
                System.out.println("Duong dan tep la :" + MyObj.getAbsoluteFile());
            } else {
                System.out.println("File khong ton tai");   
            }
            break;
            case 8:
            if(MyObj.exists()){
                System.out.println("Kich thuoc cua tep " + MyObj.getName() + " la : " + MyObj.length());
            } else {
                System.out.println("File khong ton tai");   
            }
            break;
            case 9:
                System.out.println("Danh sach la : " +  MyObj.list());
            break;
            case 10:
            File folder = new File("myFolder");
            Scanner Scc = new Scanner(System.in);
            System.out.println("Nhap lua chon cua ban thao tac voi thuc muc ");
            String ccc =  Scc.nextLine();
            switch (ccc) {
                case "tao":
                try {
                    folder.mkdir();
                    System.out.println("Tao thanh cong thu muc");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Tao that bai");
                }
                break;
                case "xoa":
                if(folder.exists()){
                    try {
                        folder.delete();
                        System.out.println("Xoa thanh cong");
                    } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("Xoa that bai" );
                    }
                } else {
                    System.out.println("Khong ton tai foder");
                }
                break;
            }
            break;
                case 11:
                break;
            default:
            System.out.println("Lua chon cua ban khong co trong nay");
                break;
        }
        }
    while(cc != 0);
    scanner.close();
    }
}
