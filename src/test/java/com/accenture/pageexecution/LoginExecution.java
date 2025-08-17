package com.accenture.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.accenture.basepackage.BaseClass;

public class LoginExecution {
	@BeforeClass(alwaysRun=true)
	public void before() {
		System.out.println("DB Connection Open");
	}
	
	@AfterClass(alwaysRun=true)
	public void after() {
		System.out.println("DB Connection Close");
	}
	
	@Test(invocationCount=2, description="This method is to test valid login")
	public void validLogin() {
		BaseClass.browserLaunch();
		BaseClass.getUrl("https://adactinhotelapp.com/");
		Assert.assertTrue(true);
		BaseClass.browserClose();
	}

	@Test(enabled=false)
	public void invalidLogin() {
		BaseClass.browserLaunch();
		BaseClass.getUrl("https://adactinhotelapp.com/");
		Assert.assertTrue(false);
		BaseClass.browserClose();
	}

}
