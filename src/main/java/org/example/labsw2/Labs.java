package org.example.labsw2;

import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Scissor (0), Rock (1), Paper (2), Lizard (3), Spock (4): ");
        int user = input.nextInt();

        int computer = (int)(Math.random() * 5);

        String computerChoice = "";
        String userChoice = "";

        if (computer == 0) {
            computerChoice = "Scissor";
        }
        else if (computer == 1) {
            computerChoice = "Rock";
        }
        else if (computer == 2){
            computerChoice = "Paper";
        }
        else if (computer == 3){
            computerChoice = "Lizard";
        }
        else {
            computerChoice = "Spock";
        }

        if (user == 0) {
            userChoice = "Scissor";
        }
        else if (user == 1) {
            userChoice = "Rock";
        }
        else if (user == 2) {
            userChoice = "Paper";
        }
        else if (user == 3){
            userChoice = "Lizard";
        }
        else {
            userChoice = "Spock";
        }

        System.out.print("The computer is " + computerChoice
                + ". You are " + userChoice);

        if (computer == user) {
            System.out.println(" too. It is a draw");
        }
        else if ((user == 0 && (computer == 2 || computer == 3))
                || (user == 1 && (computer == 0 || computer == 3))
                || (user == 2 && (computer == 1 || computer == 4))
                || (user == 3 && (computer == 2 || computer == 4))
                || (user == 4 && (computer == 0 || computer == 1))
        ) {
            System.out.println(". You won");
        }
        else {
            System.out.println(". You lost");
        }
    }
}