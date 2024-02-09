package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;


public class OrderPOM {
    private static final By nameField = By.xpath("//input[@placeholder=\"* Имя\"]");
    private static final By surnameField = By.xpath("//input[@placeholder=\"* Фамилия\"]");
    private static final By addressField = By.xpath("//input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    private static final By metroStationClickableField = By.xpath("//div[@class=\"select-search\"]");
    private static final By metroStationInputField = By.xpath("/html/body/div/div/div/div/div/div/div/input");
    private static final By phoneField = By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    private static final By nextButton = By.xpath("//button[text()=\"Далее\"]");
    private static final By calendarField = By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]");
    private static final By rentalTimeSelection = By.xpath("//div[@class=\"Dropdown-root\"]");
    private static final By orderButtonForm =
            By.xpath("//div[@class=\"Order_Buttons__1xGrp\"]/button[text()=\"Заказать\"]");
    private static final By popUpWindow = By.xpath("//div[@class=\"Order_Modal__YZ-d3\"]");
    private final WebDriver driver;

    public OrderPOM(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setUserSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setUserAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void clickMetroButton(){
        driver.findElement(metroStationClickableField).click();
    }

    public void setUserMetroStation() {
        driver.findElement(metroStationInputField).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(metroStationInputField).sendKeys(Keys.ENTER);
    }

    public void setUserPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNextButton(){
        driver.findElement(nextButton).click();

    }

    public void setRentalDate(String date) {
        driver.findElement(calendarField).sendKeys(date);
        driver.findElement(calendarField).sendKeys(Keys.ENTER);
    }

    public void clickRentalPeriodToSelect() {
        driver.findElement(rentalTimeSelection).click();
    }

    public void selectRentalPeriod(String period) {
        driver.findElement(By.xpath("//div[text()=\"" + period + "\"]")).click();
    }

    public void clickToFinalizeOrder() {
        driver.findElement(orderButtonForm).click();
    }

    public boolean isPopUpVisible() {
        return driver.findElement(popUpWindow).isDisplayed();
    }

    public void orderCheck(String name, String surname, String address, String phone, String date, String period){
        setUserName(name);
        setUserSurname(surname);
        setUserAddress(address);
        clickMetroButton();
        setUserMetroStation();
        setUserPhone(phone);
        clickNextButton();
        setRentalDate(date);
        clickRentalPeriodToSelect();
        selectRentalPeriod(period);
        clickToFinalizeOrder();
    }


}
