package PageObjects;

import BaseTest.BaseTestClass;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetrieveRatingInformation extends BaseTestClass {

    @FindBy(xpath = "//*[@src='https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@star-icon-202203010609.png,lx-24,ly-615,w-29,l-end:l-text,ie-OC42LzEwICAzMi4zSyBWb3Rlcw%3D%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00312544-utzpasftrb-portrait.jpg']")
    WebElement clickImage1;
    public RetrieveRatingInformation(){
        PageFactory.initElements(driver,this);
    }
    public void ratingInformation(){
        clickImage1.click();
    }
}
