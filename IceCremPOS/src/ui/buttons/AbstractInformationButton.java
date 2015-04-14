package ui.buttons;

import javax.swing.JButton;

import ui.panels.SalesPanel;

// can be used in the same package
abstract class AbstractInformationButton extends JButton{
		
	//for holding description, readonly
	private String description;
	
	//for holding cost; readonly
	private double cost;
	
	//for convenience, all buttons initialized with a handle to update Sales Panel
	protected SalesPanel salesPanel = SalesPanel.getSalesPanel();
	
	public AbstractInformationButton(String description, double cost) {
		// initialize
		super("[" + description + ", $" + cost + "]");
		this.description = description;
		this.cost = cost;
		
	}
		
	protected String getDescription() {
		
		return description;
		
	}
	
	
	protected double getCost() {
		
		return cost;
	}
	
}
