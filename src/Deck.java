import java.util.Random;

public class Deck extends CardCollection{

	private Random rand;
	
	public Deck() {
		super(52);
		rand = new Random();
	}
	
	//draw method, but we need hand first, so we'll wait for now
	
	public void shuffle() {
		populateDeck();
	}
	
	private void populateDeck() {
		//we fill the arraylist with cards, 52
		String[] suits = {"c", "s", "d", "h"};
		String[] names = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		int[] values   = { 2 , 3 , 4 , 5,  6,  7,  8,  9,  10, 10, 10, 10,1};
	
		//total loop iterations = 4*13
		for(int s=0;s<suits.length;s++) { //pick a suit
			for(int v=0;v<values.length;v++) {
				String name = names[v]+suits[s];
				Card c = new Card(name,values[v]);
				addCard(c); //adds the card to the cards arraylist
				
			}	
		}
	
	}
	
	
}
