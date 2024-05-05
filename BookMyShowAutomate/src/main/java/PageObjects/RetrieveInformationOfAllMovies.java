package PageObjects;

import BaseTest.BaseTestClass;
import org.apache.poi.xslf.model.ParagraphPropertyFetcher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetrieveInformationOfAllMovies extends BaseTestClass {

    @FindBy(xpath = "//*[text()='Devil: The British Secret Agent']")
    WebElement movieName1;

//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/section[1]/div/span[1]")
//    WebElement movieRating1;
    @FindBy(xpath = "//*[text()='Saindhav']")
    WebElement movieName2;

    @FindBy(xpath = "//*[text()='Spider is Back']")
    WebElement movieName3;

    @FindBy(xpath = "//*[text()='Hanu-Man']")
    WebElement movieName4;

    @FindBy(xpath = "//*[text()='Aquaman and the Lost Kingdom']")
    WebElement movieName5;

    @FindBy(xpath = "//*[text()='Hi Nanna']")
    WebElement movieName6;

    @FindBy(xpath = "//*[text()='Animal']")
    WebElement movieName7;

    @FindBy(xpath = "//*[text()='Naa Saami Ranga']")
    WebElement movieName8;

    @FindBy(xpath = "//*[text()='Salaar: Cease Fire - Part 1']")
    WebElement movieName9;

    @FindBy(xpath = "//*[text()='Pindam']")
    WebElement movieName10;

    @FindBy(xpath = "//*[text()='Maya Bazaar (1957) (Colour)']")
    WebElement movieName11;

//    @FindBy(xpath = "//*[text()='Action/Mystery/Thriller']")
//    WebElement clickImage1;

    public RetrieveInformationOfAllMovies() {
        PageFactory.initElements(driver, this);
    }

    public void informationOfMovies() {
        String movie1 = movieName1.getText();
        System.out.println("Movie1: "+ movie1);
//        String rating1= movieRating1.getText();
//        System.out.println("Rating1: "+ rating1);
        String movie2 = movieName2.getText();
        System.out.println("Movie2: "+ movie2);
        String movie3 = movieName3.getText();
        System.out.println("Movie3: "+ movie3);
        String movie4 = movieName4.getText();
        System.out.println("Movie4: "+ movie4);
        String movie5 = movieName5.getText();
        System.out.println("Movie5: "+ movie5);
        String movie6 = movieName6.getText();
        System.out.println("Movie6: "+ movie6);
        String movie7 = movieName7.getText();
        System.out.println("Movie7: "+ movie7);
        String movie8 = movieName8.getText();
        System.out.println("Movie8: "+ movie8);
        String movie9 = movieName9.getText();
        System.out.println("Movie9: "+ movie9);
        String movie10 = movieName10.getText();
        System.out.println("Movie10: "+ movie10);
        String movie11 = movieName11.getText();
        System.out.println("Movie11: "+ movie11);
//        clickImage1.click();

    }
}
