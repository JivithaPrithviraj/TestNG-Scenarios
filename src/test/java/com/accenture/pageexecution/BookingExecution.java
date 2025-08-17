package com.accenture.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.basepackage.BaseClass;

public class BookingExecution {
	@Test
	public void validLogin() {
		BaseClass.getUrl("https://www.google.com/");
		Assert.assertTrue(true);

	}

	@BeforeMethod
	public void broswerOpen() {
		BaseClass.browserLaunch();
	}

	@Test(enabled = false)
	public void invalidLogin() {
		BaseClass.getUrl("https://www.google.com/");

	}

	@Test(dependsOnMethods = { "validLogin" })
	public void booking() {

		BaseClass.getUrl("https://www.google.com/");

	}

	@AfterMethod
	public void closeBrowser() {
		BaseClass.browserClose();
	}
}
