package main.java.AppiumActivites.AppiumTestCase.TC1.UserNotification;

import main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents.HomePage_IconsEvents;
import main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents.Login_Page_Events;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTestAppium;

public class CheckNotification extends BaseTestAppium  {

    @Test(priority = 1)
    public void Click_OnSkip() throws InterruptedException {


        Thread.sleep(3000);
        driver.findElement(By.id("com.mnasat.nashmi:id/rv_skip_forward")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void Click_On_Country_Selection() throws InterruptedException {


        driver.findElement(By.id("com.mnasat.nashmi:id/tvCountryCodeNumber")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void Click_On_Egypt() throws InterruptedException {


        driver.findElement(By.id("com.mnasat.nashmi:id/cl_select_egypt")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void Click_Number_Input_Filed() throws InterruptedException {
        driver.findElement(By.id("com.mnasat.nashmi:id/etCurrentNumber")).click();
        driver.findElement(By.id("com.mnasat.nashmi:id/etCurrentNumber")).sendKeys("01015080473");
        driver.navigate().back();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void Click_On_Continue() throws InterruptedException {
        driver.findElement(By.id("com.mnasat.nashmi:id/btn_continue")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 6)
    public void Click_On_Password_Input_Filed() throws InterruptedException {
        driver.findElement(By.id("com.mnasat.nashmi:id/etNewPassword")).click();
        driver.findElement(By.id("com.mnasat.nashmi:id/etNewPassword")).sendKeys("123456");
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void Click_On_Cofirm_Button() throws InterruptedException {
        driver.findElement(By.id("com.mnasat.nashmi:id/btnLogin")).click();
        Thread.sleep(4000);
        //((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(10));
        //((AndroidDriver)driver).activateApp("com.mnasat.nashmi");
        // ((StartsActivity)driver).currentActivity();
    }

    @Test(priority = 8)
    public void Click_OnAllow() throws InterruptedException {
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        Thread.sleep(17000);
    }

    @Test(priority = 9)
    public void Click_On_Notifications_Button() throws InterruptedException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(6000);
    }

    @Test(priority = 10)
    public void Click_On_Inbox_Button() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();
        Thread.sleep(6000);
    }

    @Test(priority = 11)
    public void Click_On_Message() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup")).click();
        Thread.sleep(2000);
        String TestMessage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]")).getText();
        String expected = "Automation Test 1";
        Assert.assertEquals(TestMessage , expected);
    }
}
