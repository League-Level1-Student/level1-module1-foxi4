package _05_vault;

import java.util.Random;

public class Vault {
	int secretCode=new Random().nextInt(100000000);
	
boolean tryCode(int guess) {
		if(guess==secretCode) {
		return true;
	}
	else {
		return false;
	}
}
}


