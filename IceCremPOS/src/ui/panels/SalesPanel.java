package ui.panels;
import javax.swing.*;
import java.awt.*;
import ui.windows.*;
import domain.*;


public class SalesPanel extends JPanel {
	
	//singleton
	private static SalesPanel salesPanel;
	
	//hold an ice cream
	private IceCream iceCream;
	private JTextArea descriptionDisplay;
	private JTextField costDisplay;
	
	//initialization
	private SalesPanel() {
		
		super.setLayout(new BorderLayout());
		//for showing description
		descriptionDisplay = new JTextArea();
		descriptionDisplay.setEditable(false);
		this.add(new JScrollPane(descriptionDisplay),BorderLayout.CENTER);
		
		JPanel jp = new JPanel(new BorderLayout());
		jp.add(new JLabel("Total :  "), BorderLayout.WEST);
		//for showing total price
		costDisplay = new JTextField();
		costDisplay.setEditable(false);
		jp.add(costDisplay, BorderLayout.CENTER);
		
		
		this.add(jp, BorderLayout.SOUTH);
		
		
	}
	
	
	public static SalesPanel getSalesPanel() {
		
		if (salesPanel != null) {
		
			return salesPanel;
		}
		else {
			salesPanel = new SalesPanel();
			return salesPanel;
		}
		
	}
	
	public void createIceCream() {
		
		this.iceCream = new IceCream();
		
	}
	
	public void setFlavor(String description, double cost) {
		
		this.iceCream.setFlavor(description, cost);
		
	}
	
	public void addDecorator(String description, double cost) {
		
		this.iceCream.addDecorator(description, cost);
		
	}
	
	
	public void refreshInformation() {
		
		if (iceCream != null) {
			descriptionDisplay.setText(iceCream.getDescription());
			costDisplay.setText(String.valueOf(iceCream.getCost()));
		}
	}
	
	public void clearInformation() {
		
		descriptionDisplay.setText("");
		costDisplay.setText("");
		iceCream = null;
		
	}
	


}
