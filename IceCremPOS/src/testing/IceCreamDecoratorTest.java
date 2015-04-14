package testing;

import domain.IceCreamDecorator;
import domain.IceCreamFlavor;
import junit.framework.TestCase;

public class IceCreamDecoratorTest extends TestCase {

	
	private IceCreamDecorator iceCreamDecorator;
	
	protected void setUp() throws Exception {
		super.setUp();
		iceCreamDecorator = new IceCreamDecorator("M & M",5, new IceCreamFlavor("Chocolate",20));
		
	}

	
	public void testIceCreamDecorator() {
		
		
		//start testing iceCreamFlavordecorator
		//already initialized with Chocolate Ice Cream
		String description = "Chocolate Ice Cream\nwith M & M";
		double cost = 25.0;
		assertEquals(description, iceCreamDecorator.getDescription());
		assertEquals(cost, iceCreamDecorator.getCost());
		
		//adding more decorator
		iceCreamDecorator = new IceCreamDecorator("Strawberry",4,iceCreamDecorator);
		description = "Chocolate Ice Cream\nwith M & M\nwith Strawberry";
		cost = 29.0;
		assertEquals(description, iceCreamDecorator.getDescription());
		assertEquals(cost, iceCreamDecorator.getCost());
	}
}
