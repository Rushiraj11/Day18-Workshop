package com.bridgelabz.workshop;

import java.util.Scanner;

public class Players {
    Scanner sc = new Scanner(System.in);
    public void addNumPlayers() {
        System.out.println("Enter number of players ");
        int player = sc.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + "  players will  play the game");
        } else {
            System.out.println("please enter number of player range: minimum players 2 and maximum players 4");

    }
}
}
