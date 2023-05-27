package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XmultipkeDrop {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN1\\eclipse-workspace\\SeleniumDown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement singleOption = driver.findElement(By.xpath("//select[@name='country']"));
		
		//Select select = new Select(singleOption);
		
		//select.deselectByIndex(8);
		//select.selectByValue("ANGUILLA");
		//select.deselectByVisibleText("ARMENIA");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		WebElement Selectby = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select select = new Select(Selectby);
		
		select.selectByIndex(2);
		select.selectByValue("4");
		select.selectByVisibleText("Jul");
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
