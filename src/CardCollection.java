import java.util.ArrayList;

abstract public class CardCollection {
	protected ArrayList<Card> cards;
	
	public CardCollection(int size) {
		cards=new ArrayList<Card>(size);
	}
	
	public void addCard(Card c) {
		cards.add(c);
	}
	
	public void removeCard(Card c) {
		cards.remove(c);
	}
	
}
