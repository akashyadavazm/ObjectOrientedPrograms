package deckOfCards;

import java.util.Random;

public class DeckOfCards {
	String[][] PlayersCards = new String[3][3];
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] deckOfCards = new String[suits.length * ranks.length];

	public void uniqueCards() {

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deckOfCards[ranks.length * i + j] = ranks[j] + " of " + suits[i];
			}
		}

	}

	public void distributionOfCards() {
		Random rand = new Random();
		for (char ch = 'A'; ch <= 'D'; ch++) {

			System.out.println(" PLAYER " + ch + " Have ");

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					int index = rand.nextInt(suits.length * ranks.length);
					PlayersCards[i][j] = deckOfCards[index];

					System.out.print(PlayersCards[i][j] + " , ");
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.uniqueCards();
		deck.distributionOfCards();

	}

}
