package _99_extra;

public class Practice2 {
//trying to do one without any reference.
	//you can only look for reference twice
	//if you fail you delete or comment (//) everything so its restarted
				//looked? √
				//looked? √
	//TOPIC: Drinks
	private String favoriteDrink;
	private boolean likestheDrink;
	public Practice2(String favoriteDrink, boolean likestheDrink){
		this.favoriteDrink = favoriteDrink;
		this.likestheDrink = likestheDrink;
	}
	public boolean likestheDrink() {
if(this.likestheDrink) {
			System.out.println("I like "+ favoriteDrink +"!");
			return true;
	}
		else {
			System.out.println("I don't like " + favoriteDrink + " though..");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Practice2 drink = new Practice2("hot water", true);
		Practice2 drink2 = new Practice2("sparkling water", false);
		drink.likestheDrink();
		drink2.likestheDrink();
	}
	//yay... i looked twice though but thats fine! 
}















