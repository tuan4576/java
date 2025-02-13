package com.example.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LocalDatee {
    public void Date(){
        LocalDate now = LocalDate.now();
        System.out.println("Ngày hiện tại: " + now);
    }
    public void Time(){
        LocalTime now = LocalTime.now();
        System.out.println("Giờ hiện tại: " + now);
    }
    public void FormatDateTime(){
        String dateStr = "15-02-2025";
        DateTimeFormatter now = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, now);
        System.out.println("Ngay gio da chuyen doi: " + date);
    }
}
