package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		//driver.findElement(By.name("search")).sendKeys("Macbook Air");
		WebElement product=driver.findElement(By.xpath("//input[@name='search']"));
		product.sendKeys("Macbook Air");
		WebElement searchbtn=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchbtn.click();
		WebElement MacBook=driver.findElement(By.xpath("//img[@title='MacBook Air']"));
		MacBook.click();
		WebElement cartbtn=driver.findElement(By.id("button-cart"));
		cartbtn.click();
		WebElement cart=driver.findElement(By.id("cart"));
		cart.click();
		WebElement Viewcart=driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']"));
		Viewcart.click();
		WebElement Checkout=driver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/checkout']"));
		Checkout.click();
	}

}
