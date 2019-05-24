package polynomial;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		JTextField mainInput = new JTextField();
		mainInput.setBounds(130, 60, 100, 40);
		f.add(mainInput);
		
		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);
		f.add(b);
		
		JLabel simpleLabel = new JLabel();
		simpleLabel.setBounds(130, 140,100,40);
		simpleLabel.setText("jestem cieciem");
		f.add(simpleLabel);
		
		b.addActionListener(new ButtonActionListener(mainInput, simpleLabel));
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
