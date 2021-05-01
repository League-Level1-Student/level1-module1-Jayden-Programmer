package _06_duck;

import javax.swing.JOptionPane;

public class Cat {
int numberOfYarn; 
String FavoriteTrick;
Cat(String FavoriteTrick, int numberOfYarn) {
this.FavoriteTrick = FavoriteTrick; 
this.numberOfYarn = numberOfYarn; 
}
public Cat(String string) {
	// TODO Auto-generated constructor stub
}
public void FavoriteTrick() { 
JOptionPane.showMessageDialog(null, "cool");
}
public void numberOfYarn() { 
JOptionPane.showMessageDialog(null, "5");
}
}
