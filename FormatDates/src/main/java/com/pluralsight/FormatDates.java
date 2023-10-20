package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatDates {
    public static void main(String[] args){
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy ");
        System.out.println(today.format(fmt));

         fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(fmt));

         fmt = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(today.format(fmt));

         fmt = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(today.format(fmt));

    }
}
