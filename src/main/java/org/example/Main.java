package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
    Main caller = new Main(); // for calling other methods
        caller.menu();


    }

    void menu(){
        System.out.println("Hello and welcome!");

        System.out.println("Lets Play the Num guess game");

        System.out.println("The Rules are ");
        System.out.println("1. you'll be given 10 lives in which you have to guess the number");
        System.out.println("2. Each time you miss you'll be given a hint and a heart will be deducted");
        System.out.println("3. If your heart turn to 0 you lose");
        System.out.println("4. At start you'll be given a free choice ");
        System.out.println("The Range will be between 10 to 1000");
    }


}