package PageObjects;

import BaseTest.BaseTestClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateToMoviesSection extends BaseTestClass {

    @FindBy(xpath = "//*[text()='Movies']")
    WebElement clickOnMovies;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div")
    WebElement selectLanguage;

    public NavigateToMoviesSection() {
        PageFactory.initElements(driver,this);
    }

    public void navigateMovies() {
        clickOnMovies.click();
        selectLanguage.click();

    }
}
