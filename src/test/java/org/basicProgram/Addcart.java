package org.basicProgram;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Addcart {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.out.println("Program Starts");
		//Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		//WebDriverWait w = new WebDriverWait(driver,5);
		//WebDriverWait w =new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String addItems[] = {"Cucumber","Beetroot","Pumpkin","Walnuts"};
		addCartItems( driver,addItems);

		driver.findElement(By.cssSelector("[class=\"cart-icon\"] img")).click();
		driver.findElement(By.cssSelector("[class=\"action-block\"] button")).click();
		driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("neha");//for Invalid error text 
		driver.findElement(By.className("promoBtn")).click();
		//explicit wait
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement((By.className("promoInfo"))).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.xpath("//option[@value=\"Hong Kong\"]")).click();
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}
	

	public static void addCartItems(WebDriver driver,String addItems[] )
	{

		//String addItems[] = {"Cucumber","Beetroot","Pumpkin","Walnuts"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//String addItems[] = {"Cucumber","Beetroot","Capsicum"};
		for(int i=0;i<products.size();i++)
		{
			
			//Brocali -1kg
			//brocali , 1kg
			String[] name= products.get(i).getText().split("-");
			String FormattedName= name[0].trim();
			//format it to get actual vegetable 
			//convert array intio array list for easy search
			//check wheather name you extracted is present in arrayList or not 
			List itemsNeededList =Arrays.asList(addItems);
			
			int j=0;
			if(itemsNeededList.contains(FormattedName))		
			{
				//j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
				
				
			}
			
			
			
		}
		
		
		
		
	}

		
		
	}

