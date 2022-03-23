package TestingSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Config.Configuration;
import Com.Config.Setup;

public class Groupby {
	WebDriver driver;

	@BeforeMethod
	public void browserInit() {
		Setup set = new Setup();
		driver = set.initdriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("browserINit", true);
	}

	@Test(groups="Fresh")
	public void Fresh() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Fresh']")).click();
	}
	@Test(groups="Giftcards")
	public void GiftCards() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
	}
	
	
}
