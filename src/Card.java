
public class Card {
	private final String name;
	private final int value;
	private boolean isFlipped;
	
	//setup the initial values for the data
	public Card(String name, int value){
		this.name=name;
		this.value=value;
		isFlipped=false; //face up by default
	}
	
	public void flip() {
		isFlipped=!isFlipped;
	}
	
	public boolean isFlipped() {
		return isFlipped;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String s=String.format("%s", name);
		if(isFlipped) { //card face down
			s="XX";
		}
		return s;
	}
	
}
