package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Login_Page_Elements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class Login_Page_Events {

    public void EnterEmailField() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Login_Page_Elements.EmailFiled).click();
        elementFetch.getWebElement("ID", Login_Page_Elements.EmailFiled).sendKeys("dashboard@mnasat.com");
    }

    public void EnterPasswordField() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Login_Page_Elements.PasswordField).click();
        elementFetch.getWebElement("ID", Login_Page_Elements.PasswordField).sendKeys("QP@ssw0rd");
    }

    public void ClickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Login_Page_Elements.SignInButton).click();
    }
}
