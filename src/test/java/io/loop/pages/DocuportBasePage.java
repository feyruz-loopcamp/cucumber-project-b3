package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportBasePage {

    private static final Logger LOG = LogManager.getLogger();

    public String getElementText(String text){
        String xpath = "//*[normalize-space()='"+text+"']";
        return Driver.getDriver().findElement(By.xpath(xpath)).getText();
    }

    public WebElement getElement(String text){
        String xpath = "//*[normalize-space()='"+ text + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public void clickButton(String button){
        switch (button.toLowerCase()){
            case "continue":
                WebElement continueButton = Driver.getDriver().findElement(By.xpath("//span[.=' Continue ']"));
                BrowserUtils.clickWithJS(continueButton);
                break;
            case "home":
                WebElement homeButton = Driver.getDriver().findElement(By.xpath("//span[.='Home']"));
                BrowserUtils.waitForVisibility(homeButton, 10);
                BrowserUtils.clickWithJS(homeButton);
                break;
            case "invitations":
                WebElement invitationsButton = Driver.getDriver().findElement(By.xpath("//span[.='Invitations']"));
               // BrowserUtils.waitForVisibility(invitationsButton, 10);
                BrowserUtils.clickWithJS(invitationsButton);
                break;
            default:
                LOG.error("No such " + button + " exists");
                throw new IllegalArgumentException();
        }
    }

    public DocuportBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
