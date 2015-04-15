package ui.buttons;

import ui.panels.IceCreamFlavorPanel;
import java.awt.event.*;

public class DecoratorButton extends AbstractInformationButton {

	public DecoratorButton(String description, double cost) {
		
		super(description,cost);

		//when the button is pressed, add decorator for 
		//ice cream in the sales panel
		this.addActionListener(
		new ActionListener() {
					
		   public void actionPerformed(ActionEvent e) {
		       
			   //once a decorator is clicked, disable all flavor button
			   IceCreamFlavorPanel.getIceCreamFlavorPanel().disableAllButtons();
			   salesPanel.addDecorator(DecoratorButton.this.getDescription(),DecoratorButton.this.getCost());
			   salesPanel.refreshInformation();

		   }		
		});
	}
	


}
