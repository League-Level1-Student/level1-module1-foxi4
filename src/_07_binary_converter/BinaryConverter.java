package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//music playing as always so i might not be able to hear you well
public class BinaryConverter implements ActionListener {
	JTextField textfield = new JTextField(20);
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	void run() {

frame.setVisible(true);
JPanel panel = new JPanel();
frame.add(panel);

panel.add(textfield);
panel.add(label);
label.setText("test");
JButton button = new JButton();
button.addActionListener(this);
panel.add(button);
button.setText("Converter");
frame.pack();
	}
	//
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = textfield.getText();
		text=convert(text);
			label.setText(text);
			frame.pack();
	}
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

}
