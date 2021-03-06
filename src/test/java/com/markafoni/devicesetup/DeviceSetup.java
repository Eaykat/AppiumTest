package com.markafoni.devicesetup;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.Before;

public abstract class DeviceSetup {
	
	public static AndroidDriver installApp() throws MalformedURLException, InterruptedException{
			AndroidDriver driver;
			
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/apk/");
			File app = new File(appDir, "com.tmob.markafoni.test_3.1.5-43_TEST_LIVE.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "AppTestDevice");
			capabilities.setCapability("platformVersion", "4.4");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.tmob.markafoni.test");
			//capabilities.setCapability("appActivity", "com.tmob.markafoni.test.activity.MainActivity");
 

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
			Thread.sleep(10000);
			
			return driver;

}
}
