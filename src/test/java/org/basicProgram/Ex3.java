package org.basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		//CH
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//legend[text()=\"Radio Button Example\"]")).getText());
		driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@value=\"radio3\"]")).getText());
		//Dropdown Example
		
		WebElement stDropdowns =driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(stDropdowns);
		dropdown.selectByIndex(2);
		System.out.println("Sele ct by /Index"+dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Option3");
		System.out.println("Select By visible Text"+dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("option1");
		System.out.println("Select By Value"+dropdown.getFirstSelectedOption().getText());
		
		//Checkbox
		System.out.println(driver.findElement(By.id("checkBoxOption2")));
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		
		
		
		
		System.out.println("Program Ends");
	
	}

}
