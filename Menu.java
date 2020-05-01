import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Restaurant.Child_Rest;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class Menu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 647, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Menu");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(290, -11, 67, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 43, 217, 210);
		frame.getContentPane().add(panel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Chicken Salad      ");
		panel.add(chckbxNewCheckBox_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textField);
		textField.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Hamburger           ");
		panel.add(chckbxNewCheckBox_3);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textField_1);
		textField_1.setColumns(2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Steak                    ");
		panel.add(chckbxNewCheckBox);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textField_2);
		textField_2.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Turkey Sandwhich");
		panel.add(chckbxNewCheckBox_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textField_3);
		textField_3.setColumns(2);
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Add Item");
		panel.add(btnNewButton_2);
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(235, 43, 176, 210);
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Chocolate Cake");
		panel_1.add(chckbxNewCheckBox_6);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textField_4);
		textField_4.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Ice Cream         ");
		panel_1.add(chckbxNewCheckBox_7);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textField_5);
		textField_5.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Peach Cobbler  ");
		panel_1.add(chckbxNewCheckBox_4);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textField_6);
		textField_6.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Strawberry Cake");
		chckbxNewCheckBox_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		panel_1.add(chckbxNewCheckBox_5);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textField_7);
		textField_7.setColumns(2);
		
		JButton btnNewButton = new JButton("Add Item");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(449, 43, 176, 210);
		frame.getContentPane().add(panel_2);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Beer          ");
		panel_2.add(chckbxNewCheckBox_8);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textField_10);
		textField_10.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Cola         ");
		panel_2.add(chckbxNewCheckBox_9);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textField_8);
		textField_8.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Coffee      ");
		panel_2.add(chckbxNewCheckBox_10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textField_9);
		textField_9.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Lemonade");
		panel_2.add(chckbxNewCheckBox_11);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textField_11);
		textField_11.setColumns(2);
		
		JButton btnNewButton_1 = new JButton("Add Item");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Total");
		btnNewButton_3.addActionListener(new ActionListener() {
			private JLabel txtChicken;
			private JLabel txtHamburger;
			private JLabel txtSteak;
			private JLabel txtTurkey;
			
			private JLabel txtChocolateC;
			private JLabel txtIceCream;
			private JLabel txtPeach;
			private JLabel txtStrawberry;
			
			private JLabel txtBeer;
			private JLabel txtCola;
			private JLabel txtCoffee;
			private JLabel txtLemonade;
			
			private JLabel txtTotal;

			public void actionPerformed(ActionEvent e) {
				
				Child_Rest ItemCost = new Child_Rest();
				
				
				ItemCost.ChickenSalad = ItemCost.pChickenSalad + Double.parseDouble(txtChicken.getText());
				ItemCost.Hamburger = ItemCost.pHamburger + Double.parseDouble(txtHamburger.getText());
				ItemCost.Steak = ItemCost.pSteak + Double.parseDouble(txtSteak.getText());
				ItemCost.TurkeySandwhich = ItemCost.pTurkeySandwhich + Double.parseDouble(txtTurkey.getText());
				
				ItemCost.ChocolateCake = ItemCost.pChocolateCake + Double.parseDouble(txtChocolateC.getText());
				ItemCost.IceCream = ItemCost.pIceCream + Double.parseDouble(txtIceCream.getText());
				ItemCost.PeachCobbler = ItemCost.pPeachCobbler + Double.parseDouble(txtPeach.getText());
				ItemCost.StrawberryCake = ItemCost.pStrawberryCake + Double.parseDouble(txtStrawberry.getText());
				
				ItemCost.Beer = ItemCost.pBeer + Double.parseDouble(txtChicken.getText());
				ItemCost.Cola = ItemCost.pCola + Double.parseDouble(txtChicken.getText());
				ItemCost.Coffee = ItemCost.pCoffee + Double.parseDouble(txtChicken.getText());
				ItemCost.Lemonade = ItemCost.pLemonade + Double.parseDouble(txtChicken.getText());
				
				double iTotal = ItemCost.GetAmount();
				
				String Total = String.format("£%.2f" , iTotal);
				txtTotal.setText(Total);
				
			}
		});
		btnNewButton_3.setBounds(193, 265, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Child_Rest iExit = new Child_Rest();
				iExit.iExitSystem();
			}
		});
		btnNewButton_4.setBounds(449, 265, 117, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField cleartext = null;
				for (java.awt.Component c1:panel.getComponents())
					
				{
					if (c1.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField)c1;
						cleartext.setText(" ");
						
					}}
					
					for (java.awt.Component c2:panel_1.getComponents())
					{
					if (c2.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField)c2;
						cleartext.setText(" ");
						
				}}
					for (java.awt.Component c3:panel_2.getComponents())
					{
						if (c3.getClass().toString().contains("javax.swing.JTextField")) {
							cleartext = (JTextField)c3;
							cleartext.setText(" ");
					}
				}
			}});
		btnNewButton_5.setBounds(322, 265, 117, 29);
		frame.getContentPane().add(btnNewButton_5);
	}
}
