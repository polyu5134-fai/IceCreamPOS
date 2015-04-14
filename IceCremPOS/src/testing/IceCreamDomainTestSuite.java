package testing;

import junit.framework.Test;
import junit.framework.TestSuite;

public class IceCreamDomainTestSuite extends TestSuite {

	public static Test suite() { 
		
		TestSuite suite = new TestSuite("Domain Tests");

		suite.addTestSuite(IceCreamDecoratorTest.class);
		suite.addTestSuite(IceCreamFlavorTest.class);
		suite.addTestSuite(IceCreamTest.class);

		return suite;

	}

}
