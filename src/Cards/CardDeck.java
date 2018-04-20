package Cards;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	private Card card;
	private Random rand = new Random();
	private ArrayList<Card> discards = new ArrayList<Card>();
	private int userSelection = 0;
	private int userBet = 0;
	private String toString = null;
	
	public CardDeck() {
		
	}
	
	public CardDeck(ArrayList<Card> cd) {
		this.deck = cd;
	}
	
	public int isWin(Card a, Card b) {
		if(a.compareTo(b) > 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public ArrayList<Card> createDeck(){
		//HEARTS
		deck.add(card = new Card(Rank.ACE, Suit.HEARTS));
		deck.add(card = new Card(Rank.TWO, Suit.HEARTS));
		deck.add(card = new Card(Rank.THREE, Suit.HEARTS));
		deck.add(card = new Card(Rank.FOUR, Suit.HEARTS));
		deck.add(card = new Card(Rank.FIVE, Suit.HEARTS));
		deck.add(card = new Card(Rank.SIX, Suit.HEARTS));
		deck.add(card = new Card(Rank.SEVEN, Suit.HEARTS));
		deck.add(card = new Card(Rank.EIGHT, Suit.HEARTS));
		deck.add(card = new Card(Rank.NINE, Suit.HEARTS));
		deck.add(card = new Card(Rank.TEN, Suit.HEARTS));
		deck.add(card = new Card(Rank.JACK, Suit.HEARTS));
		deck.add(card = new Card(Rank.QUEEN, Suit.HEARTS));
		deck.add(card = new Card(Rank.KING, Suit.HEARTS));
		//DIAMONDS
		deck.add(card = new Card(Rank.ACE, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.TWO, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.THREE, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.FOUR, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.FIVE, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.SIX, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.SEVEN, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.EIGHT, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.NINE, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.TEN, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.JACK, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.QUEEN, Suit.DIAMONDS));
		deck.add(card = new Card(Rank.KING, Suit.DIAMONDS));
		//SPADES
		deck.add(card = new Card(Rank.ACE, Suit.SPADES));
		deck.add(card = new Card(Rank.TWO, Suit.SPADES));
		deck.add(card = new Card(Rank.THREE, Suit.SPADES));
		deck.add(card = new Card(Rank.FOUR, Suit.SPADES));
		deck.add(card = new Card(Rank.FIVE, Suit.SPADES));
		deck.add(card = new Card(Rank.SIX, Suit.SPADES));
		deck.add(card = new Card(Rank.SEVEN, Suit.SPADES));
		deck.add(card = new Card(Rank.EIGHT, Suit.SPADES));
		deck.add(card = new Card(Rank.NINE, Suit.SPADES));
		deck.add(card = new Card(Rank.TEN, Suit.SPADES));
		deck.add(card = new Card(Rank.JACK, Suit.SPADES));
		deck.add(card = new Card(Rank.QUEEN, Suit.SPADES));
		deck.add(card = new Card(Rank.KING, Suit.SPADES));
		//CLUBS
		deck.add(card = new Card(Rank.ACE, Suit.CLUBS));
		deck.add(card = new Card(Rank.TWO, Suit.CLUBS));
		deck.add(card = new Card(Rank.THREE, Suit.CLUBS));
		deck.add(card = new Card(Rank.FOUR, Suit.CLUBS));
		deck.add(card = new Card(Rank.FIVE, Suit.CLUBS));
		deck.add(card = new Card(Rank.SIX, Suit.CLUBS));
		deck.add(card = new Card(Rank.SEVEN, Suit.CLUBS));
		deck.add(card = new Card(Rank.EIGHT, Suit.CLUBS));
		deck.add(card = new Card(Rank.NINE, Suit.CLUBS));
		deck.add(card = new Card(Rank.TEN, Suit.CLUBS));
		deck.add(card = new Card(Rank.JACK, Suit.CLUBS));
		deck.add(card = new Card(Rank.QUEEN, Suit.CLUBS));
		deck.add(card = new Card(Rank.KING, Suit.CLUBS));
		
		return deck;
	}
	
	
	public ArrayList<Card> splitDeck(ArrayList<Card> cd) {
		ArrayList<Card> splitDeck = new ArrayList<Card>();
		for(int i = 0; i < cd.size()/2; i++) {
			splitDeck.add(i, cd.get(i));
			cd.remove(cd.get(i));
		}
		this.deck = cd;
		return splitDeck;
	}
	
	public ArrayList<Card> getDeck(){
		return deck;
	}
	
	public void addCard(Card c) {
		
	}
	
	public int size(){
		return deck.size();
	}
	
	public Card pullCard() { //pulls top card from a deck and removes that card from deck
		Card returnCard = deck.get(deck.size() - 1);
		deck.remove(deck.get(deck.size() - 1));
		return returnCard;
	}
	
	public Card getCard(int i){
		return deck.get(i);
	}
	
	public Card getTopCard(){
		return deck.get(deck.size() - 1);
	}
	
	
	public void shuffleDeck(){
		for(int i = 0; i < deck.size(); i++){
			int index = rand.nextInt(deck.size());
			Card temp = deck.get(i);
			deck.set(index, deck.get(i));
			deck.set(i, temp);
		}
	}

	public void setSelection(int userSelection) {
		this.userSelection = userSelection;
	}

	public void setBet(int userBet) {
		this.userBet = userBet;
	}
	
	public void flip(ArrayList<Card> cardArrayList) {
		
	}
}
