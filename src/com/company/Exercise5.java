package com.company;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        // write your code here
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter word");
        String input = scan.nextLine();
        scan.close();
        boolean result = isDoubloon(input);
        //System.out.println(result);
        if (result) {
            System.out.println(input + " is doubloon");
        }
        else {
            System.out.println(input + " is not doubloon");
        }
    }

    public static boolean isDoubloon(String s) {
        String testString = s.toLowerCase();
        for (int index = 0; index < testString.length(); index++) {
            int appearance = 0;
            for (int index2 = 0; index2 < testString.length(); index2++) {
                char currentChar = testString.charAt(index);
                if(testString.charAt(index2) == currentChar){
                    appearance++;
                }
            }
            if(appearance!=2){
                return false;
            }

        }
        return true;
    }
}


/*Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial,
boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines,
Isis, mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, sees, Shanghaiings, Toto
 */