package com.fleapo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	WebElement giveLoactionPermission;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	WebElement giveNotificationPermission;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
	WebElement continueBtn;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
	WebElement NextBtn;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Get started\"]")
	WebElement GetStartedBtn;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Log in\"]")
	WebElement LogINBtn;

	@FindBy(xpath = "//android.widget.EditText[@text=\"Enter your mobile number\"]")
	WebElement mobileNumberInpBox;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Send One Time Password\"]")
	WebElement senOtpBtn;

	@FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[1]")
	WebElement enterOtp1;
	@FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[2]")
	WebElement enterOtp2;
	@FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[3]")
	WebElement enterOtp3;
	@FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[4]")
	WebElement enterOtp4;

	public void waitForClick(WebElement e) {
		wait.until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

	public void waitForEnterText(WebElement e, String text) {
		wait.until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(text);
	}

	public void clickme1() {
		waitForClick(giveLoactionPermission);
	}

	public void click_continue() {

		waitForClick(continueBtn);

	}

	public void click_next() {
		waitForClick(NextBtn);
	}

	public void click_getStarted() {
		waitForClick(GetStartedBtn);
	}

	public void click_logIN() {
		waitForClick(LogINBtn);
	}

	public void click_giveNotificationPermission() {
		waitForClick(giveNotificationPermission);
	}

	public void enter_mobile_number(String x) {
		waitForEnterText(mobileNumberInpBox, x);
	}

	public void click_sendOtp() {
		waitForClick(senOtpBtn);
	}

	public void enter_otp1() {
		waitForEnterText(enterOtp1, "1");
	}

	public void enter_otp2() {
		waitForEnterText(enterOtp2, "2");
	}

	public void enter_otp3() {
		waitForEnterText(enterOtp3, "3");
	}

	public void enter_otp4() {
		waitForEnterText(enterOtp4, "4");
	}

	public void Valid_Successfull_Login() {
		clickme1();
		click_continue();
		click_next();
		click_next();
		click_getStarted();
		click_logIN();

		try {
			click_giveNotificationPermission();
		} catch (Exception e) {
			System.out.println(e);
		}

		enter_mobile_number("7377702841");
		click_sendOtp();
		enter_otp1();
		enter_otp2();
		enter_otp3();
		enter_otp4();
		click_continue();
	}

}
