package com.bridgelabz.workshop;

public class DeckOFCards {
    public static void main(String[] args) {

        System.out.println("Welcome to Deck of cards");
        Cards cardsPlay = new Cards();
        cardsPlay.initializationDeckOFCards();
       Players numofplayers= new Players();
       numofplayers.addNumPlayers();

    }

}

