package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.org.slf4j.internal.Logger;

import PageObjects.ProductsPage;

public class TestCase01 extends Base {
	
	SoftAssert ass=new SoftAssert();

	@Test
	public void test1() {
        
		ProductsPage a = new ProductsPage(Base.driver);
		a.search("Tshirts");
		String s = a.verifyText();
		ass.assertEquals(s, "wmen");
		ass.assertAll();

	}

}
