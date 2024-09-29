import org.testng.annotations.Test;

public class KsrtcTest extends BaseTest{
    KsrtcHomePage ksrtcHomePage;
    SearchResultPage searchResultPage;
    BookingPage bookingPage;
    @Test
    public void testKsrtc(){
        ksrtcHomePage = new KsrtcHomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        bookingPage = new BookingPage(driver);
        ksrtcHomePage.clickLeaveFrom();
        ksrtcHomePage.clickOnCityFrom();
        ksrtcHomePage.clickLeaveTo();
        ksrtcHomePage.clickOnCityTo();
        ksrtcHomePage.clickOnSelectDate();
        ksrtcHomePage.clickOnSearchButton();
        searchResultPage.clickOnSeatButton();
        searchResultPage.clickOnChooseSeatElement();
        searchResultPage.clickOnSelectBoardingPoint();
        searchResultPage.clickOnChikkamagaluruButton();
        searchResultPage.clickOnSelectDroppingPoint();
        searchResultPage.clickOnBengaluruButton();
        searchResultPage.clickOnProvideBassengerDetalis();
        bookingPage.sendTextToMobileNo("6789125987");
        bookingPage.sendTextToEmail("test@yahoo.com");
        bookingPage.clickOnProceedToPassenger();
        bookingPage.sendTextToNameField("test");
        bookingPage.clickOnGenderField();
        bookingPage.clickOnMaleSelect();
        bookingPage.sendTextTOAgeField("24");
        bookingPage.clickOnMaleSelect();
        bookingPage.clickOnIdCartField();
        bookingPage.clickOnPassportSelection();
        bookingPage.sendTextToIdCartNoField("1325868393797");
        bookingPage.clickOnProceedToCheckout();






    }
}
