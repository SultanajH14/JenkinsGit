package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public WebDriver dr;
	public void openBrowser(String browser, String url) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWEETY\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get(url);
		}
}
}
