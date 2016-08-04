package ebayActionsAutomate;


import static org.testng.AssertJUnit.assertEquals;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Ebaytest extends EbayAutomationpage{
	
	@Test
	public void testCountSocialIcons()
	{
	String actual  =  EbayAutomationpage.searchbox();
assertEquals(actual, "http://www.ebay.com/sch/i.html?_from=R40&_trksid=p2050601.m570.l1311.R3.TR10.TRC2.A0.H0.Xlap.TRS2&_nkw=laptop+computers&_sacat=0");
	}
	
}





