
public class MainGame {

	public static void main(String[] args) {
		//test the features that we add
		Card c1 = new Card("kd", 10);
		Card c2 = new Card("8s", 8);
		
		System.out.printf("%s%n", c1);
		System.out.printf("%s%n", c2);
		c1.flip();
		System.out.printf("%s%n", c1);
		
		CardCollection cc = new CardCollection(52);
		cc.addCard(c1);
		cc.addCard(c2);


	}

}
