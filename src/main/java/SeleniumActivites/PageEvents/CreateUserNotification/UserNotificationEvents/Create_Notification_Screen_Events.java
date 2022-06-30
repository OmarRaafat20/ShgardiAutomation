package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Create_Notification_Elements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class Create_Notification_Screen_Events {

    public void CreateNotification_TitleArabic () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Create_Notification_Elements.ArTitle).click();
        elementFetch.getWebElement("ID", Create_Notification_Elements.ArTitle).sendKeys("Automation Test");
    }

    public void CreateNotification_TitleEnglish () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Create_Notification_Elements.EnTitle).click();
        elementFetch.getWebElement("ID", Create_Notification_Elements.EnTitle).sendKeys("Automation Test 1");
    }

    public void CreateNotification_TextArabic () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Create_Notification_Elements.ArText).click();
        elementFetch.getWebElement("ID", Create_Notification_Elements.ArText).sendKeys("أختبار تطبيق");
    }

    public void CreateNotification_TextEnglish () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Create_Notification_Elements.EnText).click();
        elementFetch.getWebElement("ID", Create_Notification_Elements.EnText).sendKeys("أختبر التطبيق 2");
    }

    public void MessageTypeSelection () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Create_Notification_Elements.MessageType).click();
    }

    public void MessageTypeSelected () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Create_Notification_Elements.MessageTypeSelected).click();
    }

    public void ClickOnSendMessageButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Create_Notification_Elements.SendMessageBTN).click();
    }
}
