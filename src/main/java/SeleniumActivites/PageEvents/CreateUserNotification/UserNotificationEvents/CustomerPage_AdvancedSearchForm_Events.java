package main.java.SeleniumActivites.PageEvents.CreateUserNotification.UserNotificationEvents;

import main.java.SeleniumActivites.PageObjects.CreateUserNotification.UserNotificationObjects.Customer_Page_AdvancedSearchForm_Elements;
import main.java.SeleniumActivites.SeleniumUtilites.ElementFetch;

public class CustomerPage_AdvancedSearchForm_Events {

    public void AdvancedSearch_PhoneNumberFiled() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", Customer_Page_AdvancedSearchForm_Elements.AdvancedSearch_Title).click();
        elementFetch.getWebElement("ID", Customer_Page_AdvancedSearchForm_Elements.AdvancedSearch_PhoneNumberInput).sendKeys("+201015080473");
        elementFetch.getWebElement("ID", Customer_Page_AdvancedSearchForm_Elements.AdvancedSearch_Button).click();
    }
}
