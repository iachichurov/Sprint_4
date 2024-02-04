package pageobject;

import org.openqa.selenium.WebDriver;
import locators.OrderPageLocators;

public class OrderPOM {

    private WebDriver driver;

    public OrderPOM(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String name) {
        driver.findElement(OrderPageLocators.nameField).sendKeys(name);
    }

    public void setUserSurname(String surname) {
        driver.findElement(OrderPageLocators.surnameField).sendKeys(surname);
    }

    public void setUserAddress(String address) {
        driver.findElement(OrderPageLocators.addressField).sendKeys(address);
    }

    public void clickMetroButton(){
        driver.findElement(OrderPageLocators.metroStationClickableField).click();
    }

    public void setUserMetroStation(String station) {
        driver.findElement(OrderPageLocators.metroStationInputField).sendKeys(station);
    }

    public void setUserPhone(String phone) {
        driver.findElement(OrderPageLocators.phoneField).sendKeys(phone);
    }

    public void clickNextButton(){
        driver.findElement(OrderPageLocators.nextButton).click();

    }

    public void setRentalDate(String date) {
        driver.findElement(OrderPageLocators.calendarField).sendKeys(date);
    }

    public void clickRentalPeriodToSelect() {
        driver.findElement(OrderPageLocators.rentalTimeSelection).click();
    }

    public void selectRentalPeriod(String period) {
        driver.findElement(OrderPageLocators.rentalTimePick).sendKeys(period);
    }

    public void clickToFinalizeOrder() {
        driver.findElement(OrderPageLocators.orderButtonForm).click();
    }

    public boolean isPopUpVisible() {
        return driver.findElement(OrderPageLocators.popUpWindow).isDisplayed();
    }

    public void orderCheck(String name, String surname, String address, String station, String phone, String date, String period){
        setUserName(name);
        setUserSurname(surname);
        setUserAddress(address);
        clickMetroButton();
        setUserMetroStation(station);
        setUserPhone(phone);
        clickNextButton();
        setRentalDate(date);
        clickRentalPeriodToSelect();
        selectRentalPeriod(period);
        clickToFinalizeOrder();
    }


}
