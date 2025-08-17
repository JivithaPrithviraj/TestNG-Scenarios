package com.accenture.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void browserClose() {
		driver.close();
		driver.quit();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static WebElement SearchElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement SearchElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement SearchElementByTagname(String tagname) {
		WebElement element = driver.findElement(By.tagName(tagname));
		return element;
	}

	public static WebElement SearchElementbyLinktext(String linktext) {
		WebElement element = driver.findElement(By.linkText(linktext));
		return element;

	}

	public static WebElement SearchElementbyPartialLinktext(String partialLinkText) {
		WebElement element = driver.findElement(By.partialLinkText(partialLinkText));
		return element;
	}

	public static WebElement SearchElementbyCssSelector(String cssSelector) {
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		return element;
	}

	public static WebElement SearchElementByClassName(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}

	public static WebElement SearchElementByXpath(String xPath) {
		WebElement element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	public static String getPropertyValue(String key) throws IOException{
		File file = new File("C:\\Users\\prithviraj jivitha\\eclipse-workspace\\Jivitha\\WebAutomationJunit\\src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String property = prop.getProperty(key);
		return property;
	}


}
