package org.basicProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/\r\n");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"))).build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		a.moveToElement(driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"))).click().keyDown(Keys.SHIFT).sendKeys("toy car for kids").keyDown(Keys.ENTER).scrollByAmount(500,500).build().perform();
		//driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).click();
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		
	}

}
