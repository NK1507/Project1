package org.basicProgram;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	//Random random = new Random();
	//int randomno = 1000 + random.nextInt(9000);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
		Random random = new Random();
		int randomno = 1000 + random.nextInt(9000);
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./Screenshot/"+randomno+".png"));
		
		//System.out.println("./Screenshot/scr1"+randomno+".png");
		
		
		
		driver.quit();
		
	
		
		
	}

}
