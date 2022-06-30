package main.java.SeleniumActivites.SeleniumUtilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTestSelenium;
import java.util.List;

public class ElementFetch {

    public WebElement getWebElement (String identifierType , String identifierValue ){

        switch (identifierType){
            case "ID":
                return BaseTestSelenium.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTestSelenium.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTestSelenium.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTestSelenium.driver.findElement(By.xpath(identifierValue));
            case "CLASSNAME":
                return BaseTestSelenium.driver.findElement(By.className(identifierValue));
            case "Name":
                return BaseTestSelenium.driver.findElement(By.name(identifierValue));
            case "linkText":
                return BaseTestSelenium.driver.findElement(By.linkText(identifierValue));
            case "partialLinkText":
                return BaseTestSelenium.driver.findElement(By.partialLinkText(identifierValue));
            default:
                return null;
        }
    }
    public List<WebElement> getListWebElements (String identifierType , String identifierValue ){

        switch (identifierType){
            case "ID":
                return BaseTestSelenium.driver.findElements(By.id(identifierValue));
            case "cssSelector":
                return BaseTestSelenium.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTestSelenium.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BaseTestSelenium.driver.findElements(By.xpath(identifierValue));
            case "CLASSNAME":
                return BaseTestSelenium.driver.findElements(By.className(identifierValue));
            case "Name":
                return BaseTestSelenium.driver.findElements(By.name(identifierValue));
            case "linkText":
                return BaseTestSelenium.driver.findElements(By.linkText(identifierValue));
            case "partialLinkText":
                return BaseTestSelenium.driver.findElements(By.partialLinkText(identifierValue));
            default:
                return null;
        }
    }
}
