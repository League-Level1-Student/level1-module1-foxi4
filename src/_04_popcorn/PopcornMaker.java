package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
	 * The main method should create a bag of Popcorn and cook it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 * Don't change the existing methods.
	 */
public static void main(String[] args) {
	Microwave popcornBag = new Microwave();
	String flavor = JOptionPane.showInputDialog(null, "What flavor popcorn do you want?");
	Popcorn thingToBeCooked = new Popcorn(flavor);
String cookTimeInMinutes = JOptionPane.showInputDialog("How long should I cook the popcorn (minutes)?");
popcornBag.setTime(Integer.parseInt(cookTimeInMinutes));
popcornBag.putInMicrowave(thingToBeCooked);
popcornBag.startMicrowave();
JOptionPane.showInputDialog("How is the popcorn? :)");
}
}
