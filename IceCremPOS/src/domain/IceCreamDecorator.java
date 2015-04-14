package domain;

public class IceCreamDecorator extends IceCreamFlavor {
	
	//using decorator pattern
	private IceCreamFlavor iceCreamFlavor;
	
	public IceCreamDecorator(String description, double cost, IceCreamFlavor iceCreamFlavor) {
		
		super(description,cost) ;
		this.iceCreamFlavor = iceCreamFlavor ;
		
	}
	
	@Override
	public String getDescription() {
		
		return iceCreamFlavor.getDescription() + "\nwith " + description;
				
	}
	
	@Override
	public double getCost() {
		
		return iceCreamFlavor.getCost() + cost;
				
	}
		


}
