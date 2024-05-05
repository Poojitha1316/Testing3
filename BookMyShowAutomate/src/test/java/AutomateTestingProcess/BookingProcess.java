package AutomateTestingProcess;

import BaseTest.BaseTestClass;
import PageObjects.HomePage;
import PageObjects.NavigateToMoviesSection;
import PageObjects.RetrieveInformationOfAllMovies;
import PageObjects.RetrieveRatingInformation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingProcess extends BaseTestClass {

    @BeforeMethod
    public void login() throws Exception {
        openBrowserAndNavigate();
    }
    @Test
    public void BookingTickets() throws Exception {
        HomePage home = new HomePage();
        home.selectLocation();
        NavigateToMoviesSection navigate = new NavigateToMoviesSection();
        navigate.navigateMovies();
        RetrieveInformationOfAllMovies information = new RetrieveInformationOfAllMovies();
        information.informationOfMovies();
        RetrieveRatingInformation ratingInformation = new RetrieveRatingInformation();
        ratingInformation.ratingInformation();
    }
}
