import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Frame1 {

	private JFrame ManagementSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.ManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ManagementSystem = new JFrame();
		ManagementSystem.setBounds(100, 100, 450, 300);
		ManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ManagementSystem.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(135, 206, 250));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				JTextField textusername;
				JTextField textpassword;
				
			
				JLabel lblNewLabel = new JLabel("Username:");
				textusername = new JTextField(15);
				
				JLabel lblNewLabel_1 = new JLabel("Password:");
				textpassword = new JTextField(15);
			}
		});
		btnLogin.setBounds(156, 209, 110, 26);
		ManagementSystem.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(29, 71, 93, 26);
		ManagementSystem.getContentPane().add(lblNewLabel);
		
		JTextArea textusername = new JTextArea();
		textusername.setBounds(156, 71, 212, 16);
		ManagementSystem.getContentPane().add(textusername);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(29, 139, 93, 26);
		ManagementSystem.getContentPane().add(lblNewLabel_1);
		
		JTextArea textpassword = new JTextArea();
		textpassword.setBounds(156, 139, 212, 16);
		ManagementSystem.getContentPane().add(textpassword);
	}
}
