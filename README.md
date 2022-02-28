package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPom {
	@FindBy(xpath = "(//a[@class='nav-a  '])[1]")
	private WebElement bestseller;

	@FindBy(xpath = "(//a[@class='nav-a  '])[2]")
	private WebElement mobiles;

	@FindBy(xpath = "(//a[@class='nav-a  '])[3]")
	private WebElement todaysDeal;

	// initialiazation
	AmazonPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage
	public void bests() {
		bestseller.click();
	}

	public void mb() {
		mobiles.click();
	}

	public void TD() {
		todaysDeal.click();
	}

}
