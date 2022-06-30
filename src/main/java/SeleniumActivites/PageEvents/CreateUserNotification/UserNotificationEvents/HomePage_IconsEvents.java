package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Home_Page_IconElements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class HomePage_IconsEvents {

    public void ClickOnStakeHoldersIcon() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Home_Page_IconElements.StakeHolders).click();
    }

    public void ClickOnCustomerIcon() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Home_Page_IconElements.Customer).click();
    }
}
