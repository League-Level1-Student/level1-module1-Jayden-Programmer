package _05_vault;

import java.util.Iterator;

public class Jamesbond { 

	public int findcode(Vault v) { // variables can be used as the finding code variable   
    for (int i = 0; i < 1000000; i++) {
	v.tryCode(i); //connects with line 7
	if (v.tryCode(i)) {
 
	return i; 
	}
    } 
return -1; 
	}

}
