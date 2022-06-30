package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Advanced_SearchResult_Elements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class Advanced_SearchResult_Events {

        public void Advanced_SearchResult_ActionButton(){
            ElementFetch elementFetch = new ElementFetch();
            elementFetch.getWebElement("XPATH", Advanced_SearchResult_Elements.ActionButton).click();
        }
}
