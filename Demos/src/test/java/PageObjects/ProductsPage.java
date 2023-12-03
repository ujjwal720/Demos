package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver driver;

	public ProductsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a")
	WebElement women;

	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement search;

	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchbutt;

	public String verifyText() {

		return women.getText();

	}

	public void search(String s) {

		search.sendKeys(s);

	}

	

	public void searchbutton() {

		searchbutt.click();

	}

}
