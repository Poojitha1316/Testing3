package PageObjects;

import BaseTest.BaseTestClass;
import Utilities.ReadProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTestClass {



    @FindBy(xpath = "//*[@placeholder='Search for your city']")
    WebElement clickOnSearchBar;

    @FindBy(xpath = "//*[text()='Rajamahendravaram (']")
    WebElement selectCity;

    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement signup;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div")
    WebElement clickGoogleMail;

    @FindBy(xpath = "//*[@id='identifierId']")
    WebElement enterEmail;

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement entercontinue;

    @FindBy(xpath = "//*[text()='Sign in with Google']")
    WebElement clickSignIn;



    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    public void selectLocation() throws Exception {

        String cityPlace = ReadProperties.getPropertyy("place");

        clickOnSearchBar.click();
        clickOnSearchBar.sendKeys(cityPlace);
        selectCity.click();
//        signup.click();
////        clickGoogleMail.isSelected();
//        clickGoogleMail.click();
//        clickSignIn.click();
//        Thread.sleep(6000);
//        enterEmail.click();
//        enterEmail.sendKeys("poojithab111222@gmail.com");
//        entercontinue.click();


    }
}
