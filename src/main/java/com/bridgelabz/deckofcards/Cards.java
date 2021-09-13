package com.bridgelabz.deckofcards;

public class Cards {
    public void initializationDeckOFCards() {
        int cardcount = 0;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] deck = new String[suits.length][ranks.length];

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++)
            {
                deck[i][j] = suits[i] + " " + ranks[j];
                System.out.println(deck[i][j]);
                cardcount++;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of cards are:" + cardcount);
    }
//    public static void addNumPlayers() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of players ");
//        int player = sc.nextInt();
//        if (player >= 2 && player <= 4) {
//            System.out.println(player + "  players will  play the game");
//        } else {
//            System.out.println("please enter number of player range: minimum players 2 and maximum players 4");
//
//        }


}
