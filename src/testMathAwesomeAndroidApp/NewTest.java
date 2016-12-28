package testMathAwesomeAndroidApp;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;



public class NewTest {
	AndroidDriver driver;
	
	
	
	@BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		  DesiredCapabilities cap=new DesiredCapabilities();
	      cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	      //cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	      //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Note4");
	      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	      cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
	      cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Anthony\\AndroidStudioProjects\\MathAwesome\\app\\build\\outputs\\apk\\app-debug.apk");
	      driver =new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"), cap);

			System.out.println("setUp Awesome App");
		  
	  }
  @Test
  public void firstTest() throws InterruptedException {
	  Thread.sleep(8000);
		//driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").sendKeys("5");
		Thread.sleep(1000);
		//driver.findElementById("com.example.anthony.myapplication:id/numberTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").sendKeys("500");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(1000);
		driver.findElementById("com.example.anthony.myapplication:id/calcBtn").click();
		Thread.sleep(1000);
		WebElement Result = driver.findElementById("com.example.anthony.myapplication:id/totalTextView");
		System.out.println("Printing " + Result.getText());
		//driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").sendKeys("15");
		Thread.sleep(1000);
		//driver.findElementById("com.example.anthony.myapplication:id/numberTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").sendKeys("510");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(1000);
		driver.findElementById("com.example.anthony.myapplication:id/calcBtn").click();
		WebElement Result2 = driver.findElementById("com.example.anthony.myapplication:id/totalTextView");
		System.out.println("Printing " + Result2.getText());
		//driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/percentageTxt").sendKeys("25");
		Thread.sleep(1000);
		//driver.findElementById("com.example.anthony.myapplication:id/numberTxt").click();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").clear();
		driver.findElementById("com.example.anthony.myapplication:id/numberTxt").sendKeys("1500000");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(1000);
		driver.findElementById("com.example.anthony.myapplication:id/calcBtn").click();
		Thread.sleep(1000);
		WebElement Result3 = driver.findElementById("com.example.anthony.myapplication:id/totalTextView");
		System.out.println("Printing " + Result3.getText());
			
  }

 


  @AfterMethod
  public void afterMethod() {
	  driver.closeApp();
	  System.out.println("Done.");
	  
  }

}
