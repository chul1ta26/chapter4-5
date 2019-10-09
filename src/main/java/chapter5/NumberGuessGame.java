package chapter5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        Random random = new Random();
        int answer = random.nextInt(101);
        guess(answer);
    }


    private static void guess(int answer){
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number: ");

        int userInput = scanner.nextInt();

        if (userInput == answer){
            System.out.println(userInput + " is correct!");
        } else {
            System.out.println(userInput + " is too " + (userInput > answer ? "high" : "low"));
            System.out.println("Try again\n");
            guess(answer);
        }
    }

}
