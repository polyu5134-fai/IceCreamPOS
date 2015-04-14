package domain;

public class IceCream {
	
	//hold an iceCreamFlavor
	private IceCreamFlavor iceCreamFlavor;
	
	public String getDescription() {
		
		// if flavor is not set yet, return ""
		if (iceCreamFlavor == null) {
			
			return "" ;
			
		}
		
		return iceCreamFlavor.getDescription();
		
	}
	
	public double getCost() {
		// if flavor is not set yet, return 0
		if (iceCreamFlavor == null) {
		
			return 0.0;
			
		}
			
		return iceCreamFlavor.getCost();
		
	}
	
	public void setFlavor(String description, double cost) {
						
		this.iceCreamFlavor = new IceCreamFlavor(description,cost);
		
	}
	
	
	public void addDecorator(String description, double cost) {
		
		this.iceCreamFlavor = new IceCreamDecorator(description,cost,this.iceCreamFlavor);
		
	}
	


}
