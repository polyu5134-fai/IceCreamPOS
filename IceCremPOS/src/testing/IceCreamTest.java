package testing;

import junit.framework.TestCase;
import domain.*;

public class IceCreamTest extends TestCase {
	
	private IceCream iceCream;

	protected void setUp() throws Exception {
		super.setUp();
		
		iceCream = new IceCream();
			
	}
	
	
	public void testIceCream() {
		
		
		//start ice cream testing, it contains an icecreamflavor
		//initially the flavor is null
		String description = "";
		double cost = 0.0;
		//when icecream not setting flavor
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		description = "Chocolate Ice Cream";
		cost = 20.0;
		//after setFlavor
		iceCream.setFlavor("Chocolate", 20);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		description = "Vanilla Ice Cream";
		cost = 25.0;
		//change Flavor
		iceCream.setFlavor("Vanilla", 25);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		description = "Vanilla Ice Cream\nwith M & M";
		cost = 30.0;
		//add decorator
		iceCream.addDecorator("M & M", 5);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		description = "Vanilla Ice Cream\nwith M & M\nwith M & M";
		cost = 35.0;
		//add more same decorator
		iceCream.addDecorator("M & M", 5);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		description = "Vanilla Ice Cream\nwith M & M\nwith M & M\nwith Strawberry";
		cost = 39.0;
		//add another decorator
		iceCream.addDecorator("Strawberry", 4);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		//add another decorator in decimal places
		description = "Vanilla Ice Cream\nwith M & M\nwith M & M\nwith Strawberry\nwith Oreo";
		cost = 42.6666;
		//add another decorator
		iceCream.addDecorator("Oreo", 3.6666);
		assertEquals(description, iceCream.getDescription());
		assertEquals(cost, iceCream.getCost());
		
		//add same decorator, start having rounding problem
		//it is acceptable in this project
		description = "Vanilla Ice Cream\nwith M & M\nwith M & M\nwith Strawberry\nwith Oreo\nwith Oreo";
		cost = 46.3332;
		//add another decorator
		iceCream.addDecorator("Oreo", 3.6666);
		assertEquals(description, iceCream.getDescription());
		//the difference is less than 0.001
		assertEquals(cost, iceCream.getCost(), 0.001);
		
	}

}
