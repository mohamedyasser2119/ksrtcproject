import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
    WebDriver driver;
    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }
    By mobileNumber = By.name("mobileNo");
    By emailField = By.name("email");
    By proceedToPassenger = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]");
    By nameField = By.name("paxName[0]");
    By genderField = By.name("paxGender[0]");
    By maleSelect = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[2]/div");
    By ageField = By.name("paxAge[0]");
    By conecessionField = By.name("paxConcessionType[0]");
    By idCartField = By.name("paxIDCardType[0]");
    By passportSelection = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[6]/div");
    By idCartNoField = By.name("paxIDCardNo[0]");
    By proceedToCheckout = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[2]");







    WebElement mobileNoElement;
    WebElement emailElement;
    WebElement proceedToPassengerElement;
    WebElement nameElement;
    WebElement genderElement;
    WebElement maleSelectElement;
    WebElement ageElement;
    WebElement conecessionTypeElement;
    WebElement idCartElement;
    WebElement passportSelectionElement;
    WebElement idCartNoElement;
    WebElement proceedToCheckoutElement;



    public void sendTextToMobileNo(String mobileNo) {
        mobileNoElement = driver.findElement(mobileNumber);
        mobileNoElement.sendKeys(mobileNo);
    }

    public void sendTextToEmail(String email) {
        emailElement = driver.findElement(emailField);
        emailElement.sendKeys(email);

    }
    public void clickOnProceedToPassenger() {
        proceedToPassengerElement = driver.findElement(proceedToPassenger);
        proceedToPassengerElement.click();
    }

    public void sendTextToNameField(String name) {
        nameElement = driver.findElement(nameField);
        nameElement.sendKeys(name);
    }
    public void clickOnGenderField() {
        genderElement = driver.findElement(genderField);

    }
    public void clickOnMaleSelect() {
        maleSelectElement = driver.findElement(genderField);
        maleSelectElement.click();

    }
    public void sendTextTOAgeField(String age) {
        ageElement = driver.findElement(ageField);
        ageElement.sendKeys(age);
    }
    public void clickOnConecessionType() {
        conecessionTypeElement = driver.findElement(conecessionField);
        conecessionTypeElement.click();
    }
    public void clickOnIdCartField() {
        idCartElement = driver.findElement(idCartField);
        idCartElement.click();

    }
    public void clickOnPassportSelection() {
        passportSelectionElement = driver.findElement(passportSelection);
        passportSelectionElement.click();
    }
    public void sendTextToIdCartNoField(String idCartNo) {
        idCartNoElement = driver.findElement(idCartNoField);
        idCartNoElement.sendKeys(idCartNo);
    }
    public void clickOnProceedToCheckout() {
        proceedToCheckoutElement = driver.findElement(proceedToCheckout);
        proceedToCheckoutElement.click();
    }


}
