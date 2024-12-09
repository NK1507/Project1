package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		//CH
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(//div[@class="css-1dbjc4n r-14lw9ot r-z2wwpe.r-1rjd0u6 r-1g94qm0.r-u8s1d r-8fdsdq"]).click();
		//driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73\"] //div[@class=\"css-1dbjc4n r-18u37iz\"] //div[text()=\"Amritsar\"]")).click();
		driver.findElement(By.cssSelector("div[class=\"css-1dbjc4n r-zso239\"]")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[class=\"css-1dbjc4n r-zso239\"]")).isSelected());
		
		
	}

}
