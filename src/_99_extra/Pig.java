package _99_extra;

import javax.swing.JOptionPane;

public class Pig {

	    private String name;
	    private boolean isSheepHerder;
	     
	    public Pig(String name, boolean canHerdSheep) {   //  write code here
//1. finish pig constructor
//2. instantiate two pigs, "Babe" and "Rasher" (i guess the pigs??)
//3. Imagine there is a pig instance called ziggy. 
//Write code that will print “bacon for breakfast” if ziggy is destined to be turned into bacon, 
//or “eggs for breakfast” if he is not. 
	    	this.name = name;
	    	this.isSheepHerder = canHerdSheep;
	   
//left hand is what you're assigning to and right hand is what you're assigning to it.	    	
	    }

	    public boolean willBecomeBacon() {
	        if(this.isSheepHerder) {
	        	System.out.println("bacon for breakfast!");
	            return false;
	        }
	        else {
	        	System.out.println("eggs for breakfast～");
	            return true;
	        }
	        //if true, bacon for breakfast, false it is eggs
	    }
	    public static void main(String[] args) {
			Pig pig = new Pig("Babe", false );
			Pig pig2 = new Pig ("Rasher", true);
								   //can be true if you want the pig to be bacon >:D\\
			pig.willBecomeBacon();
			pig2.willBecomeBacon();
		}
	    //i think you can't do anything with this either just having it?
	}














