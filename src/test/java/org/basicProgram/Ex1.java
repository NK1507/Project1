package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		//CH
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		////div[@class="css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq"] //div[@class="css-1dbjc4n r-19yat4t r-1rt2jqs"]
		//driver.findElement(By.xpath("//div[@class="css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq"] //div[text()="Bagdogra"]").click();
		//driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"] //div[@class=\"wM6W7d WggQGd\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-zso239\"] //svg[@data-testid=\"svg-img\"] /circle")).click();
		
		driver.findElement(By.cssSelector("[class=\"css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4\"]")).sendKeys("7776920773");
		driver.findElement(By.xpath("//input[@data-testid=\"password-input-box-cta\"]")).sendKeys("Nivisha@123");
		driver.findElement(By.cssSelector("[data-testid=\"login-cta\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-zso239\"] //svg[@data-testid=\"svg-img\"] /circle")).click();
		
		
		
		System.out.println("Program Ends");
	}

}
