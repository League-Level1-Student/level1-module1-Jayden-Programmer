package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField; 
  




public class Binaryconverter implements ActionListener {
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton button = new JButton(); 
	JTextField field = new JTextField(20); //what your input in the paranthesis is the size of the JTextField  
	JLabel label = new JLabel();
public void run() {
button.addActionListener(this); 
frame.setVisible(true);
frame.add(panel);
frame.pack();  
panel.add(button); 
panel.add(field);  
panel.add(label);





}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String binary =  field.getText(); 
	String save = convert(binary);  
	label.setText(save); 
	frame.pack();
}
}



