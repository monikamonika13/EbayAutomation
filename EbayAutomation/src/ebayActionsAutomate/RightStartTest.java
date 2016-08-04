package ebayActionsAutomate;


import static org.testng.AssertJUnit.assertEquals;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class RightStartTest extends Rightstartautomation{

	

	@Test
	public void testCountSocialIcons()
	{
		String actual  =  Rightstartautomation.clicklink();
		assertEquals(actual, "http://www.rightstart.com/search/result/?ocat=1764");
	}
	

}
