package com.appium.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class SetUp  {
	
	static WebDriver driver;
	
	@Test
	public void launchApp() throws MalformedURLException, InterruptedException  {
		
		{
			File app= new File("C:\\Users\\dhsa7001\\eclipse-workspace\\Appium\\apk\\TDMobile_9.0.apk");
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");
		//	capabilities.setCapability("platformVersion", "platform-version");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			
			capabilities.setCapability("appPackage", "com.nielsen.TDMobileX");
			capabilities.setCapability("appActivity", "md54e9aad3514586715abecb6fdc42439f0.SplashActivity");
			capabilities.setCapability("autoGrantPermissions", "true");
			capabilities.setCapability("app", app.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
			driver.findElement(By.xpath("//*[text()='E-mail Address']")).sendKeys("Test");
			
			/*driver.findElement(By.id("password-element")).sendKeys("password");
			driver.findElement(By.id("password-element ")).click();*/
			//driver.quit();
		}
		
	}
	
	//com.android.packageinstaller:id/permission_allow_button


}
