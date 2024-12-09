package org.basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronyzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		//CH
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Thread.sleep(1000);
		
	}

}
