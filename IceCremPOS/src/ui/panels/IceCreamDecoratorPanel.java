package ui.panels;
import javax.swing.*;

import java.awt.*;

import ui.windows.*;
import ui.buttons.*;

public class IceCreamDecoratorPanel extends AbstractButtonPanel {

	//singleton
	private static IceCreamDecoratorPanel iceCreamDecoratorPanel;
	
	//private constructor
	private IceCreamDecoratorPanel() {

		//initialize some decorator button
		this.add(new DecoratorButton("M & M", 5));
		this.add(new DecoratorButton("Strawberry", 4));
		// disable all buttons initially
		this.disableAllButtons();

	}
	
	
	
	public static IceCreamDecoratorPanel getIceCreamDecoratorPanel() {
		
		if (iceCreamDecoratorPanel != null) {
			
			return iceCreamDecoratorPanel;
		}
		else {
			iceCreamDecoratorPanel = new IceCreamDecoratorPanel();
			return iceCreamDecoratorPanel;
		}
		
	}
	
	public void addButton(String description, double cost) {
		
		DecoratorButton decoratorButton = new DecoratorButton(description,cost);
		decoratorButton.setEnabled(false);
		this.add(decoratorButton);
		this.revalidate();
		
	}
	

}
