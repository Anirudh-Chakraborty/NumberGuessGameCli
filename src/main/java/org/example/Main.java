package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main caller = new Main(); // for calling other methods
        caller.menu();

        int answer = (int) (Math.random() * (1000 - 10 + 1)) + 10;
        System.out.println("Make Your 1st guess");


        for (int i = 10; i > -1; i--) {
            int choice = sc.nextInt();
            boolean camback = caller.Guess(choice,answer,i);
            if (camback) {
                System.out.println("Your guess is correct");
                int j = 10 - i;
                System.out.println("You dit it in: "+ j + "attempts");
                break;

            } else if(i>0){
                System.out.println("Lives remain: " + i);
            }
            else {
                System.out.println("All Lives Exhausted, Bad Luck or Shall I say Bad Guess");
                System.out.println("Answer was: " + answer);
                break;
            }
        }
    }

    void menu() {
        System.out.println("Hello and welcome!");

        System.out.println("Lets Play the Num guess game");

        System.out.println("The Rules are ");
        System.out.println("1. you'll be given 10 lives in which you have to guess the number");
        System.out.println("2. Each time you miss you'll be given a hint and a heart will be deducted");
        System.out.println("3. If your heart turn to 0 you lose");
        System.out.println("4. At start you'll be given a free choice ");
        System.out.println("The Range will be between 10 to 1000");
    }

    boolean Guess(int num, int answer, int i) {

        if (num == answer ) {
            System.out.println("Congo");
            return true;
        }
        else if (num < answer&& i>0) {
            System.out.println("Try higher than this");
            return false;
        }
        else if (num > answer&& i>0) {
            System.out.println("Try lower than this");
            return false;
        }
        else {
            return false;
        }
    }
}