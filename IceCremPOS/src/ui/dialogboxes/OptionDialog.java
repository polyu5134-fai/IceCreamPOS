package ui.dialogboxes;

import javax.swing.*;

import ui.panels.*;

import java.awt.*;
import java.awt.event.*;

import domain.*;


public class OptionDialog extends JDialog {
	
	private class OptionDialogListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			InformationDialog informationDialog = new InformationDialog(e);
			   
			informationDialog.setLocationRelativeTo(OptionDialog.this);
			informationDialog.setModal(true);
			informationDialog.setVisible(true);
			
		}
		
	}
	
	public OptionDialog() {
		// initialize
		JPanel optionPanel = new JPanel();
		JButton addFlavorButton = new JButton("Add Flavor");
		JButton addDecoratorButton = new JButton("Add Decorator");
		
		addFlavorButton.addActionListener(new OptionDialogListener());
		addDecoratorButton.addActionListener(new OptionDialogListener());
		
		optionPanel.add(addFlavorButton);
		optionPanel.add(addDecoratorButton);
		
		this.getContentPane().add(optionPanel);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(150, 150);
		//this.setVisible(true);
		
	}
	

}
