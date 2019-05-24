package polynomial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionListener implements ActionListener {

	private JTextField mainInput;
	private JLabel simpleLabel;
	
	public ButtonActionListener(JTextField mainInput, JLabel simpleLabel){
		this.mainInput = mainInput;
		this.simpleLabel = simpleLabel;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String textFromField = mainInput.getText();
		simpleLabel.setText(textFromField);
		
	}

}
