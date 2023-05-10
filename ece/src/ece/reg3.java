package ece;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class reg3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg3 window = new reg3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reg3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 539, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(177, 46, 113, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(74, 113, 77, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRollNo.setBounds(74, 153, 46, 14);
		frame.getContentPane().add(lblRollNo);
		
		JLabel lblEMail = new JLabel("e mail");
		lblEMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEMail.setBounds(74, 192, 46, 14);
		frame.getContentPane().add(lblEMail);
		
		textField = new JTextField();
		textField.setBounds(181, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 152, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 191, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(106, 235, 77, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
