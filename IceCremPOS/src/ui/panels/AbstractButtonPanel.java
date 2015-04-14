package ui.panels;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public abstract class AbstractButtonPanel extends JPanel {

	public AbstractButtonPanel() {
		
		//using boxLayout
		//for vertically adding buttons
		BoxLayout bl = new BoxLayout(this,BoxLayout.Y_AXIS);
		this.setLayout(bl);
		
		
	}
	
	//to be overridden
	public abstract void addButton(String description, double cost) ;
	
	
	// disable all buttons, if any
	public void disableAllButtons() {
		
		Component[] components = this.getComponents();
		for (Component component : components) {
			
			component.setEnabled(false);
			
		}
		
	}
	
	// enable all buttons, if any
	public void enableAllButtons() {
		
		Component[] components = this.getComponents();
		for (Component component : components) {
			
			component.setEnabled(true);
			
		}
		
	}
	
	
}
