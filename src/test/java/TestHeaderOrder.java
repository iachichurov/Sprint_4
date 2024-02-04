import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobject.OrderPOM;
import pageobject.OrderButtonClickPOM;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class TestHeaderOrder {
    @Test
    public void checkOrderFromHeader() {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        OrderButtonClickPOM objHeaderButton = new OrderButtonClickPOM(driver);
        objHeaderButton.clickHeaderOrderButton();
        String name = "Иван";
        String surname = "Иванов";
        String address = "Ул. Иванова, 1";
        String station = "Лубянка";
        String phone = "+79999999999";
        String date = "15.02.2024";
        String period = "сутки";
        OrderPOM objOrder = new OrderPOM(driver);
        objOrder.orderCheck(name, surname, address, station, phone, date, period);
        Assert.assertTrue(objOrder.isPopUpVisible());
        driver.quit();
    }
}
