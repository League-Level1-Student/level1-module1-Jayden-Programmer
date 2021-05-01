package _06_duck;

public class Dog {
	int numberOfFriends;
	String FavoriteTrick;

	Dog(String favoriteTrick, int numberOfFriends) {
		this.FavoriteTrick = favoriteTrick; // this is how you create new actions, methods
		this.numberOfFriends = numberOfFriends;
		System.out.println(); 
		 
		
		
		
		
	}

	public Dog(String string) { 
		// TODO Auto-generated constructor stub
	}

	void Bark() {
	}

	void walk() {

	}

	public void FavoriteTrick() { // Public void means to transfer methods 
	System.out.println("woof");
		// TODO Auto-generated method stub
		
	}
}
