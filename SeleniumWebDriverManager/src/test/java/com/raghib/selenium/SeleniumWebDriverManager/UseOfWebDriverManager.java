package com.raghib.selenium.SeleniumWebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

/* BELOW ARE NOT WORKING */
//WebDriverManager.operadriver().setup();
//WebDriver driver = new OperaDriver();	//No jars available for Opera Browser Driver

//WebDriverManager.phantomjs().setup();	//For headless browser
//PhantomJSDriver driver = new PhantomJSDriver();		

//WebDriverManager.iedriver().setup();
//WebDriver driver = new InternetExplorerDriver();
/*END*/

//ctrl+Shift+o

//References
//https://github.com/bonigarcia/webdrivermanager
//https://mvnrepository.com/

public class UseOfWebDriverManager {
	
	public static void main(String[] args) throws InterruptedException {		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}

}
