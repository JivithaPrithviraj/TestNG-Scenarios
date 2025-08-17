package com.accenture.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.basepackage.BaseClass;


public class BookingPage extends BaseClass{

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;
	@FindBy(xpath = "//select[@name='hotels']")
	public WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement roomType;
	@FindBy(xpath = "//select[@name='room_nos']")
	public WebElement roomNos;
	@FindBy(xpath = "//input[@name='datepick_in']")
	public WebElement checkinDate;
	@FindBy(xpath = "//input[@id='datepick_out']")
	public WebElement checkoutDate;
	@FindBy(xpath = "//select[@name='adult_room']")
	public WebElement adultNos;
	@FindBy(xpath = "//select[@id='child_room']")
	public WebElement childNos;
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement search;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	public WebElement radioBtn;
	@FindBy(xpath = "//input[@name='continue']")
	public WebElement continueBtn;
	@FindBy(xpath = "//input[@name='first_name']")
	public WebElement firstName;
	@FindBy(xpath = "//input[@name='last_name']")
	public WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	public WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	public WebElement cardNo;
	@FindBy(xpath = "//select[@id='cc_type']")
	public WebElement cardType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	public WebElement expMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	public WebElement expYear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	public WebElement cvv;
	@FindBy(xpath = "//input[@id='book_now']")
	public WebElement book;
	@FindBy(xpath = "//input[@name='order_no']")
	public WebElement orderNo;
}


