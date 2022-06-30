package test.java;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.URL;

public class BaseTestAppium  {

   public AppiumDriver driver;
    @BeforeTest
    public void Setup() {
        DesiredCapabilities cap = new DesiredCapabilities();
        try {
            cap.setCapability("platformName", "Android");
            cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability("udid", "RZ8MA27HJHB");
            cap.setCapability("appPackage", "com.mnasat.nashmi");
            cap.setCapability("appActivity", "com.mnasat.nashmi.presentation.splash.SplashActivity");
            //cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20");
            //cap.setCapability(MobileCapabilityType.APP, "/Users/mohammad/Desktop/Nashmi.apk");
            //cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);

        } catch (Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }
}
