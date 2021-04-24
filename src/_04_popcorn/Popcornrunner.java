package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcornrunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog(null, "What flavor do you want?"); // Clases in the .java class are important because whatever the class is made the new variable you have to create
	String time = JOptionPane.showInputDialog(null, "What time do you want it to take?");
	Popcorn pop = new Popcorn(flavor); 
	Microwave micro = new Microwave(); 
	micro.putInMicrowave(pop);
	micro.setTime(Integer.parseInt(time)); // Remember how to do the integer.parseint strategy and do it correctly inside the set.time variable
	}

}
