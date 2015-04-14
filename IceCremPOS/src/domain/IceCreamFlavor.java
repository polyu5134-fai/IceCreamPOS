package domain;

public class IceCreamFlavor {
	
	protected String description;
	protected double cost;
	
	public IceCreamFlavor(String description, double cost) {
		
		this.description = description;
		this.cost = cost;
				
	}
	
	public String getDescription() {
		
		return description + " Ice Cream";
		
	}
	
	public double getCost() {
		
		return cost;
		
	}


}
