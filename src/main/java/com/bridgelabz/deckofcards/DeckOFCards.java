package com.bridgelabz.deckofcards;

import java.util.Scanner;

public class DeckOFCards {
    public static void main(String[] args) {


        System.out.println("Welcome to Deck of cards");
        Cards cardsPlay = new Cards();
        cardsPlay.initializationDeckOFCards();
         addNumPlayers();

    }

    private static void addNumPlayers() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of players ");
            int player = sc.nextInt();
            if (player >= 2 && player <= 4) {
                System.out.println(player + "  players will  play the game");
            } else {
                System.out.println("please enter number of player range: minimum players 2 and maximum players 4");

            }

        }

}



