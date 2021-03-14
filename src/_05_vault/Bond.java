package _05_vault;

public class Bond {
	//ok
	int findCode(Vault v) {
		for(int i=0; i<89999950; i++) {
			boolean codeFound=v.tryCode(i);
			if(codeFound==true) {
				return i;
			}
		}
		//return 0;
		return -1;
	}
	
}

