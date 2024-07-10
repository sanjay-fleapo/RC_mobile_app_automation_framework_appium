package com.fleapo.base;

import com.fleapo.utils.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {
	protected AndroidDriver<WebElement> driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.fleapo.recipecup");
		capabilities.setCapability("appActivity", "com.fleapo.recipecup.MainActivity");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiautomator2");

		DriverManager.initializeAndroidDriver("http://localhost:4723", capabilities);
		driver = DriverManager.getAndroidDriver();
	}

    @AfterMethod
    public void tearDown() {
        DriverManager.quitAndroidDriver();
    }
}
