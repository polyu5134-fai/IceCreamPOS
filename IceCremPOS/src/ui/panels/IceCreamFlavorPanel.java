package ui.panels;

import ui.buttons.*;

public class IceCreamFlavorPanel extends AbstractButtonPanel {
	
	//singleton
	private static IceCreamFlavorPanel iceCreamFlavorPanel;
	
	private IceCreamFlavorPanel() {

		//initialize some flavor button
		this.add(new FlavorButton("Chocolate", 20));
		this.add(new FlavorButton("Vanilla", 25));
		//disable all buttons initially
		this.disableAllButtons();
		
	}
	
	public void addButton(String description, double cost) {
		
		FlavorButton flavorButton = new FlavorButton(description,cost);
		flavorButton.setEnabled(false);
		this.add(flavorButton);
		this.revalidate();
				
	}
	
	public static IceCreamFlavorPanel getIceCreamFlavorPanel() {
		
		if (iceCreamFlavorPanel != null) {
			
			return iceCreamFlavorPanel;
		}
		else {
			iceCreamFlavorPanel = new IceCreamFlavorPanel();
			return iceCreamFlavorPanel;
		}
		
	}
	


}
