import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    By selectSeatsButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div");
    By chooseSeat = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[5]/div[5]/text()");
    By selectBoardingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
    By chikkamagaluruButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]");
    By selectDroppingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By bengaluruButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]");
    By provideBassengerDetalis = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]");






    WebElement selectSeatButtonElement ;
    WebElement chooseSeatElement;
    WebElement selectBoardingPointElement;
    WebElement chikkamagaluruButtonElement;
    WebElement selectDroppingPointElement;
    WebElement bengaluruButtonElement;
    WebElement provideBassengerDetalisElement;


    public void clickOnSeatButton() {
        selectSeatButtonElement = driver.findElement(selectSeatsButton);
        selectSeatButtonElement.click();
    }

    public void clickOnChooseSeatElement() {
        chooseSeatElement = driver.findElement(chooseSeat);
        chooseSeatElement.click();
    }
    public void clickOnSelectBoardingPoint() {
        selectBoardingPointElement = driver.findElement(selectBoardingPoint);
        selectBoardingPointElement.click();
    }
    public void clickOnChikkamagaluruButton() {
        chikkamagaluruButtonElement = driver.findElement(chikkamagaluruButton);
        chikkamagaluruButtonElement.click();
    }
    public void clickOnSelectDroppingPoint() {
        selectDroppingPointElement = driver.findElement(selectDroppingPoint);
        selectDroppingPointElement.click();
    }
    public void clickOnBengaluruButton() {
        bengaluruButtonElement = driver.findElement(bengaluruButton);
        bengaluruButtonElement.click();
    }
    public BookingPage clickOnProvideBassengerDetalis() {
        provideBassengerDetalisElement = driver.findElement(provideBassengerDetalis);
        provideBassengerDetalisElement.click();
        return new BookingPage(driver);
    }
}
