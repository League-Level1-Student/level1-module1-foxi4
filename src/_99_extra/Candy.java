package _99_extra;

public class Candy {
//recipe: https://central.jointheleague.org/levels/Level1/Mod1Recipes/PigCandy.html
	//this class is just the attributes of the candy, you can't really do anything else with it
	private String maker;		//e.g. Hershey’s, Willy Wonka
    private boolean isChocolatey;
    private double price;    
    //instantiate your favorite candy means to call the constructor
    //so that probably means that the constructor is named your fav candy
public Candy(String maker, boolean isChocolately, double price) {
	this.maker=maker;
	this.isChocolatey=isChocolately;
	this.price=price;
}
public static void main(String[] args) {
	Candy candy = new Candy("Nestle", false, 4.39);
}
}