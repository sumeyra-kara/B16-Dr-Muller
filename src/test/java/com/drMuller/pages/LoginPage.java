package com.drMuller.pages;

import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.ConfigReader;
import com.drMuller.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (xpath = "//div[@class='navbar-tool-text ml-n3']")
    WebElement accountButton;

    @FindBy (id = "Email")
    WebElement emailInput;

    @FindBy (id = "Password")
    WebElement passwordInput;

    @FindBy (xpath = "//button[@class='btn btn-primary col-12']")
    WebElement loginButton;


    public void login(String username, String password) {
        Driver.getDriver().get(ConfigReader.get("url"));
        accountButton.click();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
