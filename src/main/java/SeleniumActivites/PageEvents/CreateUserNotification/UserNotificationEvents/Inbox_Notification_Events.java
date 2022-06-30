package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Inbox_Notification_Elements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class Inbox_Notification_Events {

    public void ClickOnInboxNotification() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Inbox_Notification_Elements.InboxNotification_Selection).click();
    }

    public void ClickonInbox_NotificationMenu() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Inbox_Notification_Elements.InBoxNotification_Menu).click();
    }

    public void SelectDefult_Message() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Inbox_Notification_Elements.InBoxNotification_DefultMessage).click();

    }

    public void ClickOn_InboxBlueButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Inbox_Notification_Elements.InBoxNotification_Button).click();
    }
}
