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
	private JTextField textChicken;
	private JTextField textHamburger;
	private JTextField textSteak;
	private JTextField textTurkey;
	private JTextField textChocolateC;
	private JTextField textIceCream;
	private JTextField textPeach;
	private JTextField textSCake;
	private JTextField textCola;
	private JTextField textCoffee;
	private JTextField textBeer;
	private JTextField textLemonade;
	private JTextField textTotal;
	private JTextField textTax;
	private JTextField textSubtotal;

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
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Salad");
		panel.add(lblNewLabel_1);
		
		textChicken = new JTextField();
		textChicken.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textChicken);
		textChicken.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Hamburger           ");
		panel.add(chckbxNewCheckBox_3);
		
		textHamburger = new JTextField();
		textHamburger.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textHamburger);
		textHamburger.setColumns(2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Steak                    ");
		panel.add(chckbxNewCheckBox);
		
		textSteak = new JTextField();
		textSteak.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textSteak);
		textSteak.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Turkey Sandwhich");
		panel.add(chckbxNewCheckBox_2);
		
		textTurkey = new JTextField();
		textTurkey.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel.add(textTurkey);
		textTurkey.setColumns(2);
		
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
		
		textChocolateC = new JTextField();
		textChocolateC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textChocolateC);
		textChocolateC.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Ice Cream         ");
		panel_1.add(chckbxNewCheckBox_7);
		
		textIceCream = new JTextField();
		textIceCream.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textIceCream);
		textIceCream.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Peach Cobbler  ");
		panel_1.add(chckbxNewCheckBox_4);
		
		textPeach = new JTextField();
		textPeach.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textPeach);
		textPeach.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Strawberry Cake");
		chckbxNewCheckBox_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		panel_1.add(chckbxNewCheckBox_5);
		
		textSCake = new JTextField();
		textSCake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_1.add(textSCake);
		textSCake.setColumns(2);
		
		JButton btnNewButton = new JButton("Add Item");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(449, 43, 176, 210);
		frame.getContentPane().add(panel_2);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Beer          ");
		panel_2.add(chckbxNewCheckBox_8);
		
		textBeer = new JTextField();
		textBeer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textBeer);
		textBeer.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Cola         ");
		panel_2.add(chckbxNewCheckBox_9);
		
		textCola = new JTextField();
		textCola.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textCola);
		textCola.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Coffee      ");
		panel_2.add(chckbxNewCheckBox_10);
		
		textCoffee = new JTextField();
		textCoffee.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textCoffee);
		textCoffee.setColumns(2);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Lemonade");
		panel_2.add(chckbxNewCheckBox_11);
		
		textLemonade = new JTextField();
		textLemonade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Rest iNum = new Child_Rest();
				iNum.Number(evt);
			}
		});
		panel_2.add(textLemonade);
		textLemonade.setColumns(2);
		
		JButton btnNewButton_1 = new JButton("Add Item");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Total");
		btnNewButton_3.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				Child_Rest ItemCost = new Child_Rest();
				double iTax, iSubtotal, iTotal;
				
				ItemCost.ChickenSalad = ItemCost.pChickenSalad + Double.parseDouble(textChicken.getText());
				ItemCost.Hamburger = ItemCost.pHamburger + Double.parseDouble(textHamburger.getText());
				ItemCost.Steak = ItemCost.pSteak + Double.parseDouble(textSteak.getText());
				ItemCost.TurkeySandwhich = ItemCost.pTurkeySandwhich + Double.parseDouble(textTurkey.getText());
				
				ItemCost.ChocolateCake = ItemCost.pChocolateCake + Double.parseDouble(textChocolateC.getText());
				ItemCost.IceCream = ItemCost.pIceCream + Double.parseDouble(textIceCream.getText());
				ItemCost.PeachCobbler = ItemCost.pPeachCobbler + Double.parseDouble(textPeach.getText());
				ItemCost.StrawberryCake = ItemCost.pStrawberryCake + Double.parseDouble(textSCake.getText());
				
				ItemCost.Beer = ItemCost.pBeer + Double.parseDouble(textBeer.getText());
				ItemCost.Cola = ItemCost.pCola + Double.parseDouble(textCola.getText());
				ItemCost.Coffee = ItemCost.pCoffee + Double.parseDouble(textCoffee.getText());
				ItemCost.Lemonade = ItemCost.pLemonade + Double.parseDouble(textLemonade.getText());
				
				
				iSubtotal= ItemCost.GetAmount();
				iTax = ItemCost.FindTax(iSubtotal);
				iTotal = iSubtotal + iTax;
				
				
				String Subtotal = String.format("£%.2f" , iSubtotal);
				textSubtotal.setText(Subtotal);
				
				String Tax = String.format("£%.2f" , iTax);
				textTax.setText(Tax);
				
				String Total = String.format("£%.2f" , iTotal);
				textTotal.setText(Total);
				
				
			}
		});
		btnNewButton_3.setBounds(200, 359, 117, 29);
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
		
		textTotal = new JTextField();
		textTotal.setBounds(41, 359, 130, 26);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);
		
		textTax = new JTextField();
		textTax.setBounds(41, 303, 130, 26);
		frame.getContentPane().add(textTax);
		textTax.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(212, 270, 61, 16);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(212, 308, 61, 16);
		frame.getContentPane().add(lblTax);
		
		textSubtotal = new JTextField();
		textSubtotal.setBounds(41, 265, 130, 26);
		frame.getContentPane().add(textSubtotal);
		textSubtotal.setColumns(10);
	}
}