package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class Binaryconverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton button = new JButton(); 
	JTextField field = new JTextField(20); //what your input in the paranthesis is the size of the JTextField  

public void run() {
button.addActionListener(this); 
frame.setVisible(true);
frame.add(panel);
frame.pack();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
}
}



