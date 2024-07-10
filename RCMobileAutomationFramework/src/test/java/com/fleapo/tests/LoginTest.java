package com.fleapo.tests;

import com.fleapo.base.BaseTest;
import com.fleapo.page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void test_Valid_Successfull_Login() {
		LoginPage loginPage = new LoginPage(driver);

		loginPage.clickme1();
		loginPage.click_continue();
		loginPage.click_next();
		loginPage.click_next();
		loginPage.click_getStarted();
		loginPage.click_logIN();

		try {
			loginPage.click_giveNotificationPermission();
		} catch (Exception e) {
			System.out.println(e);
		}

		loginPage.enter_mobile_number("7377702841");
		loginPage.click_sendOtp();
		loginPage.enter_otp1();
		loginPage.enter_otp2();
		loginPage.enter_otp3();
		loginPage.enter_otp4();
		loginPage.click_continue();

		// Add assertions to verify the login was successful
		System.out.println("Login test executed");
	}
}
