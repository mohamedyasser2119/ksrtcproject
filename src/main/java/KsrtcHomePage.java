import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KsrtcHomePage {
    WebDriver driver;
    public KsrtcHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By leaveFrom = By.linkText("Select Departure City");
    By selectCityFrom = By.xpath("//div[@class='chosen-drop']/ul/li[108]");
    By leaveTo = By.linkText("Select Destination City");
    By selectCityTo = By.xpath("//div[@class='chosen-drop']/ul/li[75]");
    By selectDate = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a");
    By searchButton = By.id("submitSearch");

    WebElement leaveFromElement;
    WebElement selectCityFromElement;
    WebElement leaveToElement;
    WebElement selectCityToElement;
    WebElement selectDateElement;
    WebElement searchButtonElement;





    public void clickLeaveFrom() {
        leaveFromElement = driver.findElement(leaveFrom);
        leaveFromElement.click();

    }
   public void clickOnCityFrom(){
        selectCityFromElement = driver.findElement(selectCityFrom);
        selectCityFromElement.click();
   }
    public void clickLeaveTo() {
        leaveToElement = driver.findElement(leaveTo);
        leaveToElement.click();

    }

    public void clickOnCityTo() {
        selectCityToElement = driver.findElement(selectCityTo);
        selectCityToElement.click();
    }

    public void clickOnSelectDate(){
        selectDateElement = driver.findElement(selectDate);
        selectDateElement.click();
    }
    public SearchResultPage clickOnSearchButton(){
        searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();
        return new SearchResultPage(driver);
    }


}
