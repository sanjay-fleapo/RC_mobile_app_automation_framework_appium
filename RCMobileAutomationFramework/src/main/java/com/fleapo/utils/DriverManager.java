package com.fleapo.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
	private static AndroidDriver<WebElement> driver;

	public static void initializeAndroidDriver(String url, DesiredCapabilities capabilities)
			throws MalformedURLException {
		driver = new AndroidDriver<>(new URL(url), capabilities);
	}

	public static AndroidDriver<WebElement> getAndroidDriver() {
		return driver;
	}

	public static void quitAndroidDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}
