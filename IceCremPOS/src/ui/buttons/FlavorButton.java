package ui.buttons;

import ui.panels.IceCreamDecoratorPanel;
import java.awt.event.*;

public class FlavorButton extends AbstractInformationButton {

	public FlavorButton (String description, double cost) {

		super(description,cost);

		//when the button is pressed, set the flavor for 
		//ice cream in the sales panel
		this.addActionListener(
		new ActionListener() {
					
		   public void actionPerformed(ActionEvent e) {
		       
			   	salesPanel.setFlavor(FlavorButton.this.getDescription(),FlavorButton.this.getCost());
				salesPanel.refreshInformation();
				   
				//only after flavor is chosen
				//it will enable to chose decorator
				IceCreamDecoratorPanel.getIceCreamDecoratorPanel().enableAllButtons();

		   }		
		});
	}
	
}
