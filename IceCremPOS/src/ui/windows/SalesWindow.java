package ui.windows;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ui.panels.*;
import ui.buttons.*;
import ui.dialogboxes.OptionDialog;

public class SalesWindow extends JFrame {
	

	public SalesWindow() {
		
		super("SalesWindow");
		//this.setLayout(new GridLayout(3,3));
		this.setLayout(new BorderLayout());
		
		//initialize the panels
		JPanel centerPanel = new JPanel(new GridLayout());
		//intialize the main Panels, it is the only object of the class(es)
		centerPanel.add(new JScrollPane(IceCreamFlavorPanel.getIceCreamFlavorPanel()));
		centerPanel.add(new JScrollPane(IceCreamDecoratorPanel.getIceCreamDecoratorPanel()));
		centerPanel.add(SalesPanel.getSalesPanel());
		this.add(centerPanel, BorderLayout.CENTER);
		
		
		JPanel topPanel = new JPanel(new GridLayout());
		topPanel.add(new JLabel("ICE-CREAM Flavor"));
		topPanel.add(new JLabel("Decorator"));
		//create ice cream button
		JButton iceCreamButton = new JButton("[New IceCream]");
		//when the iceCreamButton is pressed,
		//a new iceCream is created in sales panel
		iceCreamButton.addActionListener(
		new ActionListener() {
						
	            public void actionPerformed(ActionEvent e) {
	               
	            	//clear information
	            	SalesPanel.getSalesPanel().clearInformation();
	            	//create ice cream
	            	SalesPanel.getSalesPanel().createIceCream();
	            	//once an ice cream is created, enable all flavor button
	            	//disable all decorator button
	            	IceCreamDecoratorPanel.getIceCreamDecoratorPanel().disableAllButtons();
	            	IceCreamFlavorPanel.getIceCreamFlavorPanel().enableAllButtons();

	            }		
		});
		
		//intialize the IceCreamButton, it is the only object of the class
		topPanel.add(iceCreamButton);
		this.add(topPanel, BorderLayout.NORTH);
		
		
		JPanel bottomPanel = new JPanel(new GridLayout(1,3));
		//create admin button
		JButton adminButton = new JButton("[System Administrator]");
		//when the button is press, show optiondialog
		adminButton.addActionListener(
		new ActionListener() {
					
            public void actionPerformed(ActionEvent e) {
            	
            	//clear all information and diable all flavor and decorator buttons 
                SalesPanel.getSalesPanel().clearInformation();
                IceCreamFlavorPanel.getIceCreamFlavorPanel().disableAllButtons();
                IceCreamDecoratorPanel.getIceCreamDecoratorPanel().disableAllButtons();
                
            	OptionDialog optionDialog = new OptionDialog();
            	optionDialog.setLocationRelativeTo(adminButton);
            	optionDialog.setModal(true);
            	optionDialog.setVisible(true);

            }		
		});
		
		bottomPanel.add(adminButton);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		this.setSize(500,400);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
	}


}
