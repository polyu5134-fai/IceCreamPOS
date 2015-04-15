package ui.dialogboxes;
import javax.swing.*;

import ui.panels.*;

import java.awt.*;
import java.awt.event.*;


public class InformationDialog extends JDialog {
	
	private JTextField descriptionTextField;
	private JTextField costTextField;
	private String type;
	
	
	public InformationDialog(ActionEvent e) {
		// initialize
		JPanel informationPanel = new JPanel();
		JPanel descriptionPanel = new JPanel();
		JPanel costPanel = new JPanel();
		descriptionPanel.setLayout(new BorderLayout());
		descriptionPanel.add(new JLabel("Description : "), BorderLayout.WEST);
		descriptionPanel.add(descriptionTextField = new JTextField(20),BorderLayout.CENTER);
		
		costPanel.setLayout(new BorderLayout());
		costPanel.add(new JLabel("Cost : "), BorderLayout.WEST);
		costPanel.add(costTextField = new JTextField(20),BorderLayout.CENTER);
		
		informationPanel.add(descriptionPanel);
		informationPanel.add(costPanel);
		
		type = e.getActionCommand();
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					// polymorphism XD
					AbstractButtonPanel abstractButtonPanel;
					
					if (type.equals("Add Flavor")) {
						
						abstractButtonPanel = IceCreamFlavorPanel.getIceCreamFlavorPanel();

					}else {
						
						abstractButtonPanel = IceCreamDecoratorPanel.getIceCreamDecoratorPanel();

					}
					
					abstractButtonPanel.addButton(descriptionTextField.getText(),Double.parseDouble(costTextField.getText()));

				}catch (Exception ex) {
					// simple handling for any incorrect input
					JOptionPane.showMessageDialog(InformationDialog.this, "Invalid Input, please try again");
					
				}
				
				InformationDialog.this.dispose();
				
		   }		
		});
		
		
		this.getContentPane().add(informationPanel,BorderLayout.CENTER);
		this.getContentPane().add(confirmButton,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(350, 150);

		
	}
	
	
	
}
