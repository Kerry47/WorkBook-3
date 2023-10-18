package com.pluralsight;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
public class BedtimeStories {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        try {

        System.out.println("Enter the name of the story, here are some options: \n goldilocks.txt " +
                "\n hansel_and_gretel.txt \n mary_had_a_little_lamb.txt "  );
        String getNextInput = inputScanner.nextLine();

        FileInputStream fis = new FileInputStream(getNextInput);
        Scanner fileScanner = new Scanner(fis);
        int line = 1;

        while (fileScanner.hasNextLine()) {
            System.out.println(line + " " + fileScanner.nextLine());

            line++;
        }
        fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oopsie daisy file not found! Did you type it in correctly ?");
        }
    }
}
