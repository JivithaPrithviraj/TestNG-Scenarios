package com.accenture.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.basepackage.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	public WebElement user;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	@FindBy(xpath = "//input[@name='login']")
	public WebElement login;
	@FindBy(xpath = "//input[@value='Hello JivithaPrithviraj!']")
	public WebElement validationSuccess;

}
