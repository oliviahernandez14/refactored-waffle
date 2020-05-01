package Restaurant;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_Restaurant {
	
	public double itemcost1;
	public double itemcost2;
	public double itemcost3;
	public double itemcost4;
	
	public double ChickenSalad;
	public double Hamburger;
	public double Steak;
	public double TurkeySandwhich;
	
	public double ChocolateCake;
	public double IceCream;
	public double PeachCobbler;
	public double StrawberryCake;
	
	public double Beer;
	public double Cola;
	public double Coffee;
	public double Lemonade;
	
	
	public double pChickenSalad = 5.85;
	public double pHamburger = 8.39;
	public double pSteak = 10.00;
	public double pTurkeySandwhich = 6.79;
	
	public double pChocolateCake = 9.99;
	public double pIceCream = 4.75;
	public double pPeachCobbler = 7.98;
	public double pStrawberryCake = 9.99;
	
	public double pBeer = 12.00;
	public double pCola = 3.00;
	public double pCoffee = 4.24;
	public double pLemonade = 2.25;
	
	public double GetAmount()
	{
		 itemcost1 = ChickenSalad + Hamburger + Steak + TurkeySandwhich;
		 itemcost2 = ChocolateCake + IceCream + PeachCobbler + StrawberryCake;
		 itemcost3 = Beer + Cola + Coffee + Lemonade;
		 itemcost4 = itemcost1 + itemcost2 + itemcost3;
		 return itemcost4;
		
	}
	
	private JFrame frame;
	
	public void iExitSystem() {
		frame = new JFrame();
		if(JOptionPane.showConfirmDialog(frame, " Confirm if you want to exit" , " Restaurant Menu",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
	
	public double Tax = 0.99;
	
	public Double FindTax(double cAmount)
	{
		double FindTax = cAmount - (cAmount * Tax);
		return FindTax;
	}
	
	
	
	public void Number(java.awt.event.KeyEvent evt)
	{
		char iNumber = evt.getKeyChar();
		if(!(Character.isDigit(iNumber))
				||(iNumber == KeyEvent.VK_BACK_SPACE)
				||(iNumber == KeyEvent.VK_DELETE)) {
			evt.consume();
		}
	
	}
	
}
