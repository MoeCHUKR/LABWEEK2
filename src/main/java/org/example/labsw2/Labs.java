package org.example.labsw2;

import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        int computer = (int)(Math.random() * 3);

        String computerChoice = "";
        String userChoice = "";

        if (computer == 0) {
            computerChoice = "scissor";
        }
        else if (computer == 1) {
            computerChoice = "rock";
        }
        else {
            computerChoice = "paper";
        }

        if (user == 0) {
            userChoice = "scissor";
        }
        else if (user == 1) {
            userChoice = "rock";
        }
        else {
            userChoice = "paper";
        }

        System.out.print("The computer is " + computerChoice
                + ". You are " + userChoice);

        if (computer == user) {
            System.out.println(" too. It is a draw");
        }
        else if ((user == 0 && computer == 2)
                || (user == 1 && computer == 0)
                || (user == 2 && computer == 1)) {
            System.out.println(". You won");
        }
        else {
            System.out.println(". You lost");
        }
    }
}