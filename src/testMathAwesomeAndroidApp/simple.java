package testMathAwesomeAndroidApp;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class simple {
	//AppiumDriver driver;
/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start Awesome App");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("Quit Awesome App");
	}*/

	
	@Test
    public void testCaseSetup()throws  Exception
    {
        //service.start();
        //reader.readFile();
        DesiredCapabilities cap=new DesiredCapabilities();
        //cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Anthony\\AndroidStudioProjects\\MathAwesome\\app\\build\\outputs\\apk\\app-debug.apk");
        AndroidDriver driver =new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"), cap);

		System.out.println("setUp Awesome App");
		Thread.sleep(3000);
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").sendKeys("5");
		Thread.sleep(3000);
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").sendKeys("500");
		Thread.sleep(3000);
		driver.findElementById("com.example.anthony.myapplication:id/calcBtn").click();
		//com.example.anthony.myapplication:id/percentageTxt
		//com.example.anthony.myapplication:id/numberTxt
		//com.example.anthony.myapplication:id/calcBtn
		//com.example.anthony.myapplication:id/content_main
		
	}

/*	@After
	public void tearDown() throws Exception {
		//driver.quit();
		System.out.println("End Awesome App");
		
	}

	@Test
	public void test() {
		System.out.println("Start Testing Awesome App");
		
	}*/

}
