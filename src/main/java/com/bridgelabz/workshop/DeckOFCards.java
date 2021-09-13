package com.bridgelabz.workshop;

public class DeckOFCards {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck of cards");
        int card=0;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] array = new String[4][13];
        String[][] deck = new String[suits.length][ranks.length];


        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i][j] = suits[i] + " " + ranks[j];
                System.out.println(deck[i][j]);
                card++;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of cards are:" + card);
    }

}

