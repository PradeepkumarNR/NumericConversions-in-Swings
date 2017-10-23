import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RomanKata extends JFrame {
	private JTextField txtEnter;
	private JLabel lblOutput;
	
	public void convertToRoman(){
		String enteredNumberInText= txtEnter.getText();
		String message ="";
		String convertedMessage ="";
		
		int enteredNumberInDigit = Integer.parseInt(enteredNumberInText);
		if(enteredNumberInDigit==1){
			convertedMessage="I";
			message =  enteredNumberInDigit + " converted to "+ convertedMessage;
			lblOutput.setText(message);
		}else if(enteredNumberInDigit==2){
			
			convertedMessage="II";
			message =  enteredNumberInDigit + " converted to "+ convertedMessage;
			lblOutput.setText(message);
		}
		
		
	
		
	}
	
	public RomanKata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblRomanNumeric = new JLabel("ROMAN NUMERIC ");
		lblRomanNumeric.setBounds(231, 6, 168, 16);
		getContentPane().add(lblRomanNumeric);
		
		JLabel lblNewLabel = new JLabel("ENTER ANY NUMBER ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(192, 64, 180, 16);
		getContentPane().add(lblNewLabel);
		
		txtEnter = new JTextField();
		txtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertToRoman();
			}
		});
		txtEnter.setBounds(202, 122, 168, 34);
		getContentPane().add(txtEnter);
		txtEnter.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertToRoman();
			}
		});
		btnOk.setBounds(202, 198, 168, 29);
		getContentPane().add(btnOk);
		
		 lblOutput = new JLabel("Enter a number and press OK ");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(169, 269, 248, 16);
		getContentPane().add(lblOutput);
	}


	public static void main(String[] args) {
		RomanKata romankata= new RomanKata();

		romankata.setSize(new Dimension(430,330));
		romankata.setVisible(true);

	}
}
