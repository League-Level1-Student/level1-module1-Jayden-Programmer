package _05_vault;

public class Vault {
	int secretcode = 0;

	public Vault(int num) { // matches 
		secretcode = num; // matches
	}

	public boolean tryCode(int num) {
		return num == secretcode; // when code hits return it changes back to normal code
	} 
}
