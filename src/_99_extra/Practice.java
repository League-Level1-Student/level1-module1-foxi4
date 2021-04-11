package _99_extra;

public class Practice {
	//playing music as always :]
//INSTRUCTIONS
	//TOPIC: Color √
	//Setup: need privates for each constructor?/. make a public that has "Name"(String l,Boolean o, Char 2, idk one of those). √
	//this."thing"="thinge"...  put in boolean (return true or false), you know things that will make an actual thing happen √
	//make a runner in the same class (put a main out of the parenthesis of the constructor. make sure to call the variables for it to work
	//1. make constructor
		//make the public including (string, boolean, etc. stuff like that)
	//2. runner (main)
	//3. in main method, do the Practice (practice because that is the class name, can change), (String, boolean, etc. thing)
	//4. call the things
 //btw i moved the outliner (outlier??) and task down for more space 
	//oh ok me
	
	private String Colorname;
	private boolean likestheColor;
	public Practice(String name, boolean canliketheColor) {
		this.Colorname = name;
		this.likestheColor = canliketheColor;
	}
		public boolean likestheColor() {
			if(this.likestheColor) {
				System.out.println(Colorname + " is a nice color :)");
			return true;
			}
			else {
			System.out.println(Colorname + " sucks!");
			return false;
			}
		}
		public static void main(String[] args) {
			Practice Colorname = new Practice("blue", true);
			Practice Colorname2 = new Practice("hot pink", false);
			Colorname.likestheColor();
			Colorname2.likestheColor();
			//yeah kind of i think i should do another without getting reference
		}
}
