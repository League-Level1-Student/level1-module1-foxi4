package _05_vault;

public class BondRunner {
public static void main(String[] args) {
	Vault vault= new Vault();
	Bond bond = new Bond();
	//in these types of codes do we usually make things like "new Vault();"
//int, char, boolean, etc.=primitive types that can hold values. primitive types 
	//turn purple and are LOWER cased. thats why string is different
	//strings (String)=reference type, but can initialize like a primitive type
	//everything else is referenced like a reference type???
	System.out.print("Code was " + bond.findCode(vault));
	
}
}
