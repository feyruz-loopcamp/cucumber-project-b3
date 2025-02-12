package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage extends DocuportBasePage  {

    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccountText;

    public ClientPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
