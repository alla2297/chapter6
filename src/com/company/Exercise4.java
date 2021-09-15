package com.company;
import java.util.Scanner;
//abecedarian
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character :");
        String input = scan.nextLine().toLowerCase();
        scan.close();
        //System.out.println(input); //se om det virker
        int index = input.length() - 1;

        for (int i = 0; i < index; i++) {
            //System.out.println(input.charAt(i)<= input.charAt(i+1));
            if (input.charAt(i) <= input.charAt(i + 1)) {
                //checking  the word, whether each letter is less than the before letter.
            } else {
                System.out.println("String is not Abecedarian ");
                return;
            }
        }
        System.out.println("String is  Abecedarian ");
    }
}
//abecedarian