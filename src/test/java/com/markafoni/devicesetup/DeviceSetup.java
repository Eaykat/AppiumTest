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
	
	private static AndroidDriver androiddriver;
	 public static AndroidDriver installApp() throws MalformedURLException, InterruptedException{
			AndroidDriver driver;
			
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/apk/");
<<<<<<< HEAD
			File app = new File(appDir, "markafoni.test.apk");
=======
			File app = new File(appDir, "com.markafoni.apk");
>>>>>>> f965e007270d247909f34b5f90214f9dbe0b1d90

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "AppTestDevice");
			capabilities.setCapability("platformVersion", "4.4");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
<<<<<<< HEAD
			capabilities.setCapability("appPackage", "Your app Package");
=======
			capabilities.setCapability("appPackage", "com.markafoni.test");
			//capabilities.setCapability("appActivity", "com.tmob.markafoni.test.activity.MainActivity");
>>>>>>> f965e007270d247909f34b5f90214f9dbe0b1d90

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
			Thread.sleep(10000);
			
			return driver;

}
}
