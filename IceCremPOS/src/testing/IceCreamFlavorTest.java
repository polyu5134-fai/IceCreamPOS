package testing;

import domain.IceCreamFlavor;
import junit.framework.TestCase;

public class IceCreamFlavorTest extends TestCase {

	
	private IceCreamFlavor iceCreamFlavor;
	
	protected void setUp() throws Exception {
		super.setUp();
		iceCreamFlavor = new IceCreamFlavor("Chocolate", 20);
	}

	
	public void testIceCreamFlavor() {
		
		//start testing iceCreamFlavor
		String description = "Chocolate Ice Cream";
		double cost = 20.0;
		assertEquals(description, iceCreamFlavor.getDescription());
		assertEquals(cost, iceCreamFlavor.getCost());
		
		//test another flavor
		iceCreamFlavor = new IceCreamFlavor("Coffee", 33);
		description = "Coffee Ice Cream";
		cost = 33.0;
		assertEquals(description, iceCreamFlavor.getDescription());
		assertEquals(cost, iceCreamFlavor.getCost());
		
		
	}
	
	
}
