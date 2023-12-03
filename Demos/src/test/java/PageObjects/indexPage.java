package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {

	WebDriver driver;

	public indexPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='login']")
	WebElement signIn;

	public void ClickonSign() {

		signIn.click();

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
