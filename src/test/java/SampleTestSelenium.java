package test.java;

import main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents.*;
import org.testng.annotations.Test;

public class SampleTestSelenium extends BaseTestSelenium {

    @Test
    public void LoginTest() throws InterruptedException {

        // Login TO DashBoard
        Login_Page_Events login_Page_Events = new Login_Page_Events();
        login_Page_Events.EnterEmailField();
        login_Page_Events.EnterPasswordField();
        login_Page_Events.ClickOnSignInButton();
        WaitMethod();

        // Click On Customer ICON on Home Page + Waiting for Page Load
        HomePage_IconsEvents homePage_IconsEvents = new HomePage_IconsEvents();
        homePage_IconsEvents.ClickOnStakeHoldersIcon();
        WaitMethod();
        homePage_IconsEvents.ClickOnCustomerIcon();
        WaitMethod();
        homePage_IconsEvents.ClickOnCustomerIcon();


        // Click On Advanced Search Form to Search For User
        CustomerPage_AdvancedSearchForm_Events customerPage_AdvancedSearchForm_Events = new CustomerPage_AdvancedSearchForm_Events();
        WaitMethod();
        customerPage_AdvancedSearchForm_Events.AdvancedSearch_PhoneNumberFiled();
        WaitMethod();
        ScrollDown();
        WaitMethod();

        // Click On Advanced Search Result to See User Details
        Advanced_SearchResult_Events advanced_SearchResult_Events = new Advanced_SearchResult_Events();
        advanced_SearchResult_Events.Advanced_SearchResult_ActionButton();
        WaitMethod();
        MoveToTheNewTab();
        ScrollDown();
        WaitMethod();

        // Click On Create Notification
        Inbox_Notification_Events inbox_Notification_Events = new Inbox_Notification_Events();
        inbox_Notification_Events.ClickOnInboxNotification();
        WaitMethod();
        inbox_Notification_Events.ClickonInbox_NotificationMenu();
        WaitMethod();
        inbox_Notification_Events.SelectDefult_Message();
        WaitMethod();
        inbox_Notification_Events.ClickOn_InboxBlueButton();
        WaitMethod();

        // Create Notification and send it to the User
        Create_Notification_Screen_Events create_Notification_Screen_Events = new Create_Notification_Screen_Events();
        create_Notification_Screen_Events.CreateNotification_TitleArabic();
        WaitMethod();
        create_Notification_Screen_Events.CreateNotification_TitleEnglish();
        WaitMethod();
        create_Notification_Screen_Events.CreateNotification_TextArabic();
        WaitMethod();
        create_Notification_Screen_Events.CreateNotification_TextEnglish();
        WaitMethod();
        create_Notification_Screen_Events.MessageTypeSelection();
        WaitMethod();
        create_Notification_Screen_Events.MessageTypeSelected();
        WaitMethod();
        create_Notification_Screen_Events.ClickOnSendMessageButton();
        WaitMethod();
    }
}
