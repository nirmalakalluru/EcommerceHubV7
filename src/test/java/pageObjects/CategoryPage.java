package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{
	
	// constructor
	public CategoryPage(WebDriver driver) {
		super(driver);
	}
	
	// locators
	// link_Laptops
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	WebElement link_Laptops;
	
	//link show_all
	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	WebElement link_ShowAll;
	
	// product_HP
	@FindBy(xpath = "//a[normalize-space()='HP LP3065']")
	WebElement product_HP;
	
	// methods
	public void clickLaptopsAndNotebooks() throws InterruptedException {
		// scroll to view
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", link_Laptops);
				Thread.sleep(1000);
				link_Laptops.click(); // click on element
	}
	
	public void clickShowAll() {
		link_ShowAll.click();
	}
	
	public void selectHPProduct() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", product_HP);
		Thread.sleep(1000);
		product_HP.click(); // click on element
	}
}
