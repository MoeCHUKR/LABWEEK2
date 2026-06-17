package org.example.labsw2;

import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        int computer = (int)(Math.random() * 3);

        System.out.println("Computer: " + computer);
        System.out.println("User: " + user);
    }
}