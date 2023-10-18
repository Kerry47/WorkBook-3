package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String[] quotes = new String[10];
        quotes[0] = "Don't let the bed bugs bite";
        quotes[1] ="Genius may have its limitations, but stupidity is not thus handicapped.";
        quotes[2] = "In politics stupidity is not a handicap.";
        quotes[3] = "I walk around like everything’s fine, but deep down, inside my shoe, my sock is sliding off.";
        quotes[4] = "Common sense is like deodorant. The people who need it most never use it.";
        quotes[5] = "I’m at a place in my life when errands are starting to count as going out.";
        quotes[6] = "When life gives you melons, you could be dyslexic.";
        quotes[7] = "Life would be a lot easier if it wasn’t so hard.";
        quotes[8] = "I’m a smart person. I just do stupid things.";
        quotes[9] = "I can’t brain today. I have the dumb.";

        int index = getStringInput(scanner, "Choose a quote between 1 - 10: ") -1;
        System.out.println(quotes[index]);
    }
    public static int getStringInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        int scannedInt = Integer.parseInt(scanner.nextLine()) ;
        while (scannedInt > 10 || scannedInt < 1){
            System.out.println("Make sure its between 1 - 10!!");
            scannedInt = Integer.parseInt(scanner.nextLine());
        }

        return scannedInt;


    }
}
