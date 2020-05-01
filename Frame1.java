import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;

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
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(156, 209, 110, 26);
		ManagementSystem.getContentPane().add(btnLogin);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(156, 71, 212, 16);
		ManagementSystem.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(156, 139, 212, 16);
		ManagementSystem.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(29, 71, 93, 26);
		ManagementSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(29, 139, 93, 26);
		ManagementSystem.getContentPane().add(lblNewLabel_1);
	}
}
